package com.example.arijghazouani.repository;

import com.example.arijghazouani.entity.Rayon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface RayonRepository extends JpaRepository<Rayon, Long> {
}
