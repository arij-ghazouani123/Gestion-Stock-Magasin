package com.example.arijghazouani.repository;

import com.example.arijghazouani.entity.CategorieClient;
import com.example.arijghazouani.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    List<Client> getClientsByCategorieClient(CategorieClient categorieClient);

}
