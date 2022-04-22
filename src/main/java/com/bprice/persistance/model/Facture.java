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
    private String IdFacture;
    private String IdContrat;
    private String NumeroFacture;
    private String Statut;
    private String Montant;
    @Temporal(TemporalType.TIMESTAMP)
    private Date DateCreation;
}
