package com.bprice.persistance.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class FormatAffichage {
    @Id
    private String idFormatAffichage;
    private String type;
    private String libelle;
    private int fActif;
}
