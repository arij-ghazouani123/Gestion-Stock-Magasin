package com.example.arijghazouani.repository;

import com.example.arijghazouani.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
