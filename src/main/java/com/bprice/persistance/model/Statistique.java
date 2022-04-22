package com.bprice.persistance.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Statistique {
    @Id
    private String idStatistique;
    private String idActionMarketing;
    private int nombreDiffusionMobile;
    private int nombreDiffusionTv;
    private int nombreEnvoieSms;
    private int nombreClick;
    private int nombrePartage;
}
