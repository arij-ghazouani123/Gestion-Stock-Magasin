package com.example.arijghazouani.repository;

import com.example.arijghazouani.entity.Facture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FactureRepository extends JpaRepository<Facture, Long> {

    List<Facture> getFactureByClientIdClient(Long idClient);
}
