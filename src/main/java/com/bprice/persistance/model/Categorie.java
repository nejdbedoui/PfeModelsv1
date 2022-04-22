package com.bprice.persistance.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Categorie {
    @Id
    private String IdCategorie;
    private String IdActionMarketing;
    private String Libelle;
    private String Description;
}
