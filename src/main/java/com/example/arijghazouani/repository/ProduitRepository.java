package com.example.arijghazouani.repository;

import com.example.arijghazouani.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
