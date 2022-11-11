package com.example.springdatajpajavakim.model.dto;

import com.example.springdatajpajavakim.model.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class CategoryDto {
   private Long id;
   private String name;

   public CategoryDto(Long id, String name){
      this.id = id;
      this.name = name;
   }



}
