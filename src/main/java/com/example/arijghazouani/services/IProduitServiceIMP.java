package com.example.arijghazouani.services;

import com.example.arijghazouani.entity.Produit;
import com.example.arijghazouani.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IProduitServiceIMP implements IProduitService{
   @Autowired
   ProduitRepository produitRepository;

    @Override
    public List<Produit> retrieveAllProduits() {
        return produitRepository.findAll();
    }

    @Override
    public Produit addProduit(Produit p, Long idRayon, Long idStock) {
        return produitRepository.save(p);
    }

    @Override
    public Produit retrieveProduit(Long id) {
        return produitRepository.findById(id).orElse(null);
    }
}
