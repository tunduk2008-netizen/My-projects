package com.example.agora.listing;

import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final ListingRepository listingRepo;
    private final com.example.agora.category.CategoryRepository categoryRepo;

    public UserController(ListingRepository listingRepo, com.example.agora.category.CategoryRepository categoryRepo) {
        this.listingRepo = listingRepo;
        this.categoryRepo = categoryRepo;
    }

    @PostMapping("/listing")
    public Listing create(@RequestBody CreateListingRequest req) {
        Listing l = new Listing();
        l.setTitle(req.title);
        l.setDescription(req.description);
        l.setPrice(req.price);
        l.setOwnerEmail(req.ownerEmail);

        if (req.categoryId != null) {
            Optional<com.example.agora.category.Category> c = categoryRepo.findById(req.categoryId);
            c.ifPresent(l::setCategory);
        }

        return listingRepo.save(l);
    }

    @PutMapping("/listing/{id}")
    public Listing update(@PathVariable Long id, @RequestBody CreateListingRequest req) {
        Listing l = listingRepo.findById(id).orElseThrow(() -> new RuntimeException("Объявление не найдено"));
        if (!l.getOwnerEmail().equals(req.ownerEmail)) {
            throw new RuntimeException("Нельзя редактировать чужое объявление");
        }
        if (req.title != null) l.setTitle(req.title);
        if (req.description != null) l.setDescription(req.description);
        if (req.price != null) l.setPrice(req.price);
        if (req.categoryId != null) {
            categoryRepo.findById(req.categoryId).ifPresent(l::setCategory);
        }
        l.setUpdatedAt(java.time.Instant.now());
        return listingRepo.save(l);
    }

    @DeleteMapping("/listing/{id}")
    public void delete(@PathVariable Long id, @RequestParam String ownerEmail) {
        Listing l = listingRepo.findById(id).orElseThrow(() -> new RuntimeException("Объявление не найдено"));
        if (!l.getOwnerEmail().equals(ownerEmail)) {
            throw new RuntimeException("Нельзя удалить чужое объявление");
        }
        listingRepo.delete(l);

    }
}
