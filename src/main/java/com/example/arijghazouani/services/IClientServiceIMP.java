package com.example.arijghazouani.services;

import com.example.arijghazouani.entity.CategorieClient;
import com.example.arijghazouani.entity.Client;
import com.example.arijghazouani.entity.Facture;
import com.example.arijghazouani.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class IClientServiceIMP implements IClientService{

    private final ClientRepository clientRepository;
    public IClientServiceIMP(ClientRepository clientRepository)
    {
        this.clientRepository = clientRepository;
    }

    @Override
    public List<Client> retrieveAllClients() {

        return clientRepository.findAll();
    }

    @Override
    public Client addClient(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public Client updateClient(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public Client retrieveClient(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public float getChiffreAffaireParCategorieClient(CategorieClient categorieClient, Date startDate, Date endDate) {
        List<Client> clients = clientRepository.getClientsByCategorieClient(categorieClient);
               float som = 0;
        for(Client c : clients)
            som += sommeFactureParDate(c,startDate, endDate);
        return som;
    }


    private float sommeFactureParDate(Client client, Date dateD, Date dateF){
        float som = (float) client.getFactures().stream()
                .filter(facture ->  facture.getActive() == false &&
                        facture.getDateFacture().after(dateD)  &&
                        facture.getDateFacture().before(dateF))
                .collect(Collectors.summarizingDouble(Facture::getMontantFacture))
                .getSum();
        return som;
    }

}
