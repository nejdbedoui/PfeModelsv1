package com.bprice.persistance.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class PopulationCible {
    @Id
    private String IdPopulationCible;
    private String IdActionMarketing;
    private String Age;//30-40
    private String Sexe;//h,f,h-f
    private String Ville;
}
