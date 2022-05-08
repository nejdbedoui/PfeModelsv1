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
    private String idContrat;
    private String idActionMarketing;
    private String idPartenaire;
    private String numeroContrat;
    private int statutContrat;

    private String descriptionAction;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDebut;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFin;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
}
