package com.example.arijghazouani.services;

import com.example.arijghazouani.entity.Stock;

import java.util.List;

public interface IStockService {

  public  List<Stock> retrieveAllStocks();

   public Stock addStock(Stock s);

   public Stock updateStock(Stock u);

   public  Stock retrieveStock(Long id);
}
