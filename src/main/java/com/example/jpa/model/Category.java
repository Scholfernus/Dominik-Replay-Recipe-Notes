package com.example.jpa.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
@ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}
