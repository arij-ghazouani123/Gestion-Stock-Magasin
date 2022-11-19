package com.example.arijghazouani.services;

import com.example.arijghazouani.entity.Produit;

import java.util.Date;
import java.util.List;

public interface IProduitService {

   public List<Produit> retrieveAllProduits();
   public Produit addProduit(Produit p, Long idRayon, Long idStock);

   public Produit retrieveProduit(Long id);

   void assignProduitToStock(Long idProduit, Long idStock);

   public void assignFournisseurToProduit(Long fournisseurId, Long produitId);

   float getRevenuBrutProduit(Long idProduit, Date startDate, Date endDate);
}
