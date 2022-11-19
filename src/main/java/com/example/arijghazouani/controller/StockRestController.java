package com.example.arijghazouani.controller;

import com.example.arijghazouani.entity.Client;
import com.example.arijghazouani.entity.Stock;
import com.example.arijghazouani.services.IStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("stock")
public class StockRestController {

    @Autowired
    IStockService iStockService;

    @GetMapping("retrieveAllStocks")
    public List<Stock> retrieveAllStocks() {
        return iStockService.retrieveAllStocks();
    }

    @PostMapping("/addStock")
    public Stock addStock(@RequestBody Stock s) {
        return iStockService.addStock(s);
    }


    @PutMapping("/updateStock")
    public Stock updateStock(@RequestBody Stock u) {
        return iStockService.updateStock(u);
    }



    @GetMapping("/getone/{id}")
    public Stock  retrieveStock(@PathVariable(value = "id")Long id){
        return iStockService.retrieveStock(id);
    }



}
