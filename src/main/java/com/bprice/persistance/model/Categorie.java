package com.bprice.persistance.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection ="sector")
public class Categorie {
    @Id
    private String idClientType;
    private String code;
    private String designation;
    private int fActif;
}
