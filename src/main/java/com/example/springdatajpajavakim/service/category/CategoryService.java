package com.example.springdatajpajavakim.service.category;


import com.example.springdatajpajavakim.model.dto.CategoryDto;
import com.example.springdatajpajavakim.model.request.CategoryReq;

import java.util.List;
import java.util.stream.Stream;

public interface CategoryService {

    List<CategoryDto> getAll();
}
