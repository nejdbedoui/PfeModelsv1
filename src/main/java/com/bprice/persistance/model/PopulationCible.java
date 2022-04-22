package com.bprice.persistance.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class PopulationCible {
    @Id
    private String idPopulationCible;
    private String idActionMarketing;
    private String age;//30-40
    private String sexe;//h,f,h-f
    private String ville;
}
