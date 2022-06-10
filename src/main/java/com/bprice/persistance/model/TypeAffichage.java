package com.bprice.persistance.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class TypeAffichage {
    @Id
    private String idTypeAffichage;
    private String libelle;
    private int fActif;

}
