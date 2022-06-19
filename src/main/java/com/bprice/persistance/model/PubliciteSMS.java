package com.bprice.persistance.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class PubliciteSMS {
    @Id
    private String idPubMobile;
    private String idActionMarketing;
    private String urlextern;
    private int ageMin;
    private int ageMax;
    private String sexe;
    private int frequence;
}
