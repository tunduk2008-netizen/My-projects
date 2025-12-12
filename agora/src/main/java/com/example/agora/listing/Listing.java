package com.example.agora.listing;

import jakarta.persistence.*;
import com.example.agora.category.Category;
import java.time.Instant;

@Entity
@Table(name = "listings")
public class Listing {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(length = 2000)
    private String description;

    private Double price;

    // Для простоты: привязка к категории
    @ManyToOne
    private Category category;

    private String ownerEmail; // мы не делаем таблицу users, просто сохраняем email владельца

    private Instant createdAt = Instant.now();
    private Instant updatedAt = Instant.now();

    public Listing() {}

    // getters / setters
    public Long getId(){return id;}
    public void setId(Long id){this.id=id;}
    public String getTitle(){return title;}
    public void setTitle(String title){this.title=title;}
    public String getDescription(){return description;}
    public void setDescription(String description){this.description=description;}
    public Double getPrice(){return price;}
    public void setPrice(Double price){this.price=price;}
    public Category getCategory(){return category;}
    public void setCategory(Category category){this.category=category;}
    public String getOwnerEmail(){return ownerEmail;}
    public void setOwnerEmail(String ownerEmail){this.ownerEmail=ownerEmail;}
    public Instant getCreatedAt(){return createdAt;}
    public void setCreatedAt(Instant createdAt){this.createdAt=createdAt;}
    public Instant getUpdatedAt(){return updatedAt;}
    public void setUpdatedAt(Instant updatedAt){this.updatedAt=updatedAt;}
}
