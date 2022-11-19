package com.example.arijghazouani.services;

import com.example.arijghazouani.entity.Client;
import com.example.arijghazouani.entity.Facture;
import com.example.arijghazouani.repository.ClientRepository;
import com.example.arijghazouani.repository.FactureRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IFactureServiceIMP implements IFactureService{
    private final ClientRepository clientRepository;
    private final FactureRepository factureRepository;

    public IFactureServiceIMP(ClientRepository clientRepository, FactureRepository factureRepository) {
        this.clientRepository = clientRepository;
        this.factureRepository = factureRepository;
    }

    @Override
    public List<Facture> retrieveAllFactures() {
        return factureRepository.findAll();
    }

    @Override
    public void cancelFacture(Long id) {
        Facture facture = factureRepository.findById(id).orElse(null);
        if (facture != null) {
            facture.setActive(false);
            factureRepository.save(facture);
        }
    }

    @Override
    public Facture retrieveFacture(Long id) {
        return factureRepository.findById(id).orElse(null);
    }

    @Override
    public List<Facture> getFacturesByClient(Long idClient) {
        return factureRepository.getFactureByClientIdClient(idClient);
    }

    @Override
    public Facture addFacture(Facture f, Long idClient) {
        Client client = clientRepository.findById(idClient).orElse(null);
        if(client != null)
            f.setClient(client);
        return null;
    }
    }

