package com.example.agora.listing;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ListingRepository extends JpaRepository<Listing, Long> {
    List<Listing> findByCategoryId(Long categoryId);
    List<Listing> findByPriceBetween(Double min, Double max);
}
