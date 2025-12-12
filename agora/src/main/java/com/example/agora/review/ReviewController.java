package com.example.agora.review;

import com.example.agora.listing.Listing;
import com.example.agora.listing.ListingRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    private final ReviewRepository reviewRepo;
    private final ListingRepository listingRepo;

    // Spring через конструктор внедряет репозитории
    public ReviewController(ReviewRepository reviewRepo, ListingRepository listingRepo) {
        this.reviewRepo = reviewRepo;
        this.listingRepo = listingRepo;
    }

    // Создать отзыв
    @PostMapping
    public Review create(@RequestBody CreateReviewRequest request) {
        // Ищем Listing по id
        Listing listing = listingRepo.findById(request.listingId)
                .orElseThrow(() -> new RuntimeException("Listing с таким id не найден"));

        Review review = new Review();
        review.setReviewerEmail(request.reviewerEmail);
        review.setRating(Math.max(1, Math.min(5, request.rating))); // 1-5
        review.setComment(request.comment);
        review.setListing(listing);

        return reviewRepo.save(review);
    }

    // Получить отзывы по listingId
    @GetMapping("/listing/{listingId}")
    public List<Review> getByListing(@PathVariable Long listingId) {
        return reviewRepo.findByListingId(listingId);
    }
}
