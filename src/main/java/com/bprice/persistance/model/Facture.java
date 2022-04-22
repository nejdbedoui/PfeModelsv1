package com.bprice.persistance.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
@Document
public class Facture {
    @Id
    private String idFacture;
    private String idContrat;
    private String numeroFacture;
    private String statut;
    private String montant;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
}
