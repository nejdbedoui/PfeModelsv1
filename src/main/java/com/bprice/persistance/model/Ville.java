package com.bprice.persistance.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import org.springframework.data.annotation.Id;

@Data
@Document
public class Ville {
    @Id
    private String idVille;
    private String libelle;
    private int nombreUser;
    private int nombreHomme;
    private int nombreFemme;
    private int fActive;

}
