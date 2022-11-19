package com.example.arijghazouani.services;

import com.example.arijghazouani.entity.Fournisseur;
import com.example.arijghazouani.entity.Produit;
import com.example.arijghazouani.entity.Rayon;
import com.example.arijghazouani.entity.Stock;
import com.example.arijghazouani.repository.FournisseurRepository;
import com.example.arijghazouani.repository.ProduitRepository;
import com.example.arijghazouani.repository.RayonRepository;
import com.example.arijghazouani.repository.StockRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class IProduitServiceIMP implements IProduitService{
    private final ProduitRepository produitRepository;
    private final StockRepository stockRepository;
    private final RayonRepository rayonRepository;

   private final FournisseurRepository fournisseurRepository;

    public IProduitServiceIMP(ProduitRepository produitRepository, StockRepository stockRepository, RayonRepository rayonRepository, FournisseurRepository fournisseurRepository) {
        this.produitRepository = produitRepository;
        this.stockRepository = stockRepository;
        this.rayonRepository = rayonRepository;
        this.fournisseurRepository = fournisseurRepository;
    }

    @Override
    public List<Produit> retrieveAllProduits() {
        return produitRepository.findAll();
    }

    @Override
    public Produit addProduit(Produit p, Long idRayon, Long idStock) {
        Rayon rayon = rayonRepository.findById(idRayon).orElse(null);
        Stock stock = stockRepository.findById(idStock).orElse(null);
        p.setRayon(rayon);
        p.setStock(stock);
        return produitRepository.save(p);
    }

    @Override
    public Produit retrieveProduit(Long id) {
        return produitRepository.findById(id).orElse(null);
    }

    @Override
    public void assignProduitToStock(Long idProduit, Long idStock) {
        Produit p = this.retrieveProduit(idProduit);
        Stock s = this.stockRepository.findById(idStock).orElse(null);
        if(p!= null && s != null) {
            p.setStock(s);
        }
    }

    @Override
    public void assignFournisseurToProduit(Long fournisseurId, Long produitId) {
        Produit p = this.retrieveProduit(produitId);
        Fournisseur f = this.fournisseurRepository.findById(fournisseurId).orElse(null);
        if(p != null && f != null) {
            p.getFournisseurs().add(f);
            produitRepository.save(p);
        }
    }

    @Override
    public float getRevenuBrutProduit(Long idProduit, Date startDate, Date endDate) {
        return 0;
    }
}
