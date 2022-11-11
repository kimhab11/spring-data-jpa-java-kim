package com.example.springdatajpajavakim.service.category;

import com.example.springdatajpajavakim.model.dto.CategoryDto;
import com.example.springdatajpajavakim.model.entity.Category;
import com.example.springdatajpajavakim.model.request.CategoryReq;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@AllArgsConstructor
public class CategoryServiceImp implements CategoryService{
    private final CategoryRepository categoryRepository;

    @Override
    public List<CategoryDto> getAll() {
        var result = categoryRepository.findAll();
        return result.stream().map(Category::toDto).collect(Collectors.toList());
    }
}
