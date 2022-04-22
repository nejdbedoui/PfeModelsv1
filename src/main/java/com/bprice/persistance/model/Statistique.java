package com.bprice.persistance.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Statistique {
    @Id
    private String IdStatistique;
    private String IdActionMarketing;
    private int NombreDiffusionMobile;
    private int NombreDiffusionTv;
    private int NombreEnvoieSms;
    private int NombreClick;
    private int NombrePartage;
}
