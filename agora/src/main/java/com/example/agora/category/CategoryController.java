package com.example.agora.category;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/admin/categories")
public class CategoryController {

    private final CategoryRepository repo;

    public CategoryController(CategoryRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Category create(@RequestBody Category category) {
        return repo.save(category);
    }

    @GetMapping
    public List<Category> list() {
        return repo.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        System.out.println();
        repo.deleteById(id);
    }
}
