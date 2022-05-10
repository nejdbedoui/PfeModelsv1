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
    private String age;//30-40
    private int sexe;//h,f,h-f
    private List<String> ville;
}
