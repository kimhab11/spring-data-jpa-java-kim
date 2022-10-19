package com.example.springdatajpajavakim.service.category;

import com.example.springdatajpajavakim.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
