package com.bprice.persistance.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
@Document
public class Contrat {
    @Id
    private String IdContrat;
    private String IdActionMarketing;
    private String IdPartenaire;
    private String NumeroContrat;
    private String StatutContrat;
    private String StatutAction;
    private String LibelleCanalDiffusion;
    private String DescriptionAction;
    @Temporal(TemporalType.TIMESTAMP)
    private Date DateDebut;
    @Temporal(TemporalType.TIMESTAMP)
    private Date DateFin;
    @Temporal(TemporalType.TIMESTAMP)
    private Date DateCreation;
}
