package com.example.produits.repos;

import com.example.produits.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository <Categorie, Long> {
}
