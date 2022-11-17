package com.example.arijghazouani.controller;

import com.example.arijghazouani.entity.Produit;
import com.example.arijghazouani.entity.Stock;
import com.example.arijghazouani.services.IProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("produit")
public class ProduitRestController {

    @Autowired
    IProduitService iProduitService;


    @GetMapping("retrieveAllProduits")
    public List<Produit> retrieveAllProduits() {
        return iProduitService.retrieveAllProduits();
    }



    @PostMapping("/addProduit")
    public Produit addProduit(@RequestBody Produit p, Long idRayon, Long idStock) {
        return iProduitService.addProduit(p,  idRayon, idStock);
    }


    @GetMapping("/getone/{id}")
    public Produit  retrieveProduit(@PathVariable(value = "id")Long id){
        return iProduitService.retrieveProduit(id);
    }


}
