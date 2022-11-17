package com.example.arijghazouani.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduit;
    private String codeProduit;
    private String libelleProduit;
    private float prixUnitaire;

    @ManyToOne
    Rayon rayon;

    @ManyToOne
    Stock stock;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Fournisseur> fournisseurs;

    @OneToOne(mappedBy = "produit")
    private DetailProduit detailProduit;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="produit")
    private Set<DetailFacture> detailFactures;



}
