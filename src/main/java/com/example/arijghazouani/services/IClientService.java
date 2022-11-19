package com.example.arijghazouani.services;

import com.example.arijghazouani.entity.CategorieClient;
import com.example.arijghazouani.entity.Client;

import java.util.Date;
import java.util.List;

public interface IClientService {

  public List<Client> retrieveAllClients();
  public Client addClient(Client c);
   public void deleteClient(Long id);
   public Client updateClient(Client c);
   public Client retrieveClient(Long id);

    float getChiffreAffaireParCategorieClient(CategorieClient categorieClient, Date startDate, Date endDate);
}
