package com.example.arijghazouani.services;

import com.example.arijghazouani.entity.Facture;
import com.example.arijghazouani.repository.FactureRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IFactureServiceIMP implements IFactureService{
   @Autowired
    FactureRepository factureRepository;


    @Override
    public List<Facture> retrieveAllFactures() {
        return factureRepository.findAll();
    }

    @Override
    public void cancelFacture(Long id) {
        factureRepository.deleteById(id);
    }

    @Override
    public Facture retrieveFacture(Long id) {
        return factureRepository.findById(id).orElse(null);
    }
}
