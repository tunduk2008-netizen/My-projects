package com.example.agora.review;

import jakarta.persistence.*;
import com.example.agora.listing.Listing;

@Entity
@Table(name = "reviews")
public class Review {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String reviewerEmail;
    private int rating; // 1-5
    private String comment;

    @ManyToOne
    private com.example.agora.listing.Listing listing;

    public Review() {}

    // getters/setters
    public Long getId(){return id;}
    public void setId(Long id){this.id=id;}
    public String getReviewerEmail(){return reviewerEmail;}
    public void setReviewerEmail(String e){this.reviewerEmail=e;}
    public int getRating(){return rating;}
    public void setRating(int r){this.rating=r;}
    public String getComment(){return comment;}
    public void setComment(String c){this.comment=c;}
    public Listing getListing(){return listing;}
    public void setListing(Listing l){this.listing=l;}
}
