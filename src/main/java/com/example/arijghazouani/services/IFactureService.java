package com.example.arijghazouani.services;

import com.example.arijghazouani.entity.Facture;

import java.util.List;

public interface IFactureService {

    public List<Facture> retrieveAllFactures();
   public void cancelFacture(Long id);
   public Facture retrieveFacture(Long id);
}
