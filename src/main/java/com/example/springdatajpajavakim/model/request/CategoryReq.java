package com.example.springdatajpajavakim.model.request;

import com.example.springdatajpajavakim.model.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryReq {
    private String name;

    public Category toEntity(){
        return new Category(null, this.name);
    }

    public Category toEntity(Long id){
        return new Category(id, this.name);
    }
}
