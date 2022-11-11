package com.example.springdatajpajavakim.model.entity;

import com.example.springdatajpajavakim.model.dto.CategoryDto;
import lombok.*;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    public CategoryDto toDto(){
        return new CategoryDto(this.id, this.name);
    }

}
