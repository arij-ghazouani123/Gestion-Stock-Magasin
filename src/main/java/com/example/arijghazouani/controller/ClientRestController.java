package com.example.arijghazouani.controller;


import com.example.arijghazouani.entity.Client;
import com.example.arijghazouani.services.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("client")
public class ClientRestController {

    @Autowired
    IClientService iClientService;


    @GetMapping("retrieveAllClients")
    public List<Client> retrieveAllClients() {
        return iClientService.retrieveAllClients();
    }



    @PostMapping("/addClient")
    public Client addClient(@RequestBody Client c) {
        return iClientService.addClient(c);
    }



    @PutMapping("/updateClient")
    public Client updateClient(@RequestBody Client c) {
        return iClientService.updateClient(c);
    }


    @DeleteMapping("/delete/{id}")
    public void deleteClient(@PathVariable(value = "id") Long id) {
        iClientService.deleteClient(id);
    }


    @GetMapping("/getone/{id}")
    public Client  retrieveClient(@PathVariable(value = "id")Long id){
        return iClientService.retrieveClient(id);
    }


}
