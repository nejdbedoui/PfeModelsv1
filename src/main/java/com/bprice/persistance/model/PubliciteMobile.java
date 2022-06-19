package com.bprice.persistance.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class PubliciteMobile {
    @Id
    private String idPubMobile;
    private String idActionMarketing;
    private String lienAction;
    private String urlExtern;
    private int frequence;
    private boolean active;
    private int ageMin;
    private int ageMax;
    private int sexeCible;
}
