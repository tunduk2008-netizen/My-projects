package com.example.agora.listing;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/public")
public class PublicController {

    private final ListingRepository listingRepo;

    public PublicController(ListingRepository listingRepo) {
        this.listingRepo = listingRepo;
    }

    // GET /api/public/listings
    // опционально: ?categoryId=1 или ?minPrice=10&maxPrice=200
    @GetMapping("/listings")
    public List<Listing> listings(
            @RequestParam(required = false) Long categoryId,
            @RequestParam(required = false) Double minPrice,
            @RequestParam(required = false) Double maxPrice
    ) {
        if (categoryId != null) {
            return listingRepo.findByCategoryId(categoryId);
        }
        if (minPrice != null && maxPrice != null) {
            return listingRepo.findByPriceBetween(minPrice, maxPrice);
        }
        return listingRepo.findAll();
    }
    @GetMapping("/listings/top")
    public List<Listing> topListings() {
        return listingRepo.findAll().stream()
                .sorted((a,b) -> b.getUpdatedAt().compareTo(a.getUpdatedAt()))
                .toList();
    }

}
