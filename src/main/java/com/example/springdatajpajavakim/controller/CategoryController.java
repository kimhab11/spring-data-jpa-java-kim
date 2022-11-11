package com.example.springdatajpajavakim.controller;

import com.example.springdatajpajavakim.model.dto.CategoryDto;
import com.example.springdatajpajavakim.model.entity.Category;
import com.example.springdatajpajavakim.service.category.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("category")
public class CategoryController {
    private CategoryService categoryService;

    @GetMapping("")
    public List<CategoryDto> getAll(){
        var data = categoryService.getAll();
        return data;
    }


}
