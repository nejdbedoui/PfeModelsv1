package com.bprice.persistance.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class CanalDiffusion {
    @Id
    private String idCanaldiffusion;
    private String libelle;
    private int fActif;
}
