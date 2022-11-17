package com.example.arijghazouani.controller;

import com.example.arijghazouani.entity.Client;
import com.example.arijghazouani.entity.Facture;
import com.example.arijghazouani.services.IFactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("facture")
public class FactureRestController {

    @Autowired
    IFactureService iFactureService;


    @GetMapping("retrieveAllFactures")
    public List<Facture> retrieveAllFactures() {
        return iFactureService.retrieveAllFactures();
    }


    @GetMapping("/getone/{id}")
    public Facture  retrieveFacture(@PathVariable(value = "id")Long id){
        return iFactureService.retrieveFacture(id);
    }


    // cancelFacture
    @DeleteMapping("/delete/{id}")
    public void cancelFacture(@PathVariable(value = "id") Long id) {
     //   iFactureService.cancelFacture(id);
    }


}
