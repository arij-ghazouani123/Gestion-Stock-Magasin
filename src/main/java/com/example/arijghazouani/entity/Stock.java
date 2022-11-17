package com.example.arijghazouani.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStock;
    private int qteStock;
    private int qteMin;
    private  String libelleStock;


    @OneToMany(cascade = CascadeType.ALL, mappedBy="stock")
    private Set<Produit> produits;
}
