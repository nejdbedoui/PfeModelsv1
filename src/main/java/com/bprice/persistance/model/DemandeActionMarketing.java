package com.bprice.persistance.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
@Document
public class DemandeActionMarketing {
    @Id
    private String idDemande;
    private String idPartenaire;
    private String idAction;
    private int notification;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
}
