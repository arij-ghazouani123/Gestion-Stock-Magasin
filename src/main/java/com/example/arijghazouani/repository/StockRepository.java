package com.example.arijghazouani.repository;

import com.example.arijghazouani.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long> {
}
