package com.bprice.persistance.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class PopulationCible {
    @Id
    private String idPopulationCible;
    private int ageMin;//30-40
    private int ageMax;
    private int sexe;//h,f,h-f
    private int fActif;
    private List<String> ville;
}
