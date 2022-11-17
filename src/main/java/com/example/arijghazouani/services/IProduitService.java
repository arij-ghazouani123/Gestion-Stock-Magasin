package com.example.arijghazouani.services;

import com.example.arijghazouani.entity.Produit;

import java.util.List;

public interface IProduitService {

   public List<Produit> retrieveAllProduits();
   public Produit addProduit(Produit p, Long idRayon, Long idStock);

   public Produit retrieveProduit(Long id);
}
