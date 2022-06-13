package com.bprice.persistance.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.List;

@Data
@Document
public class ActionMarketing {
    @Id
    private String idActionMarketing;
    private String idPartenaire;
    private String idCategorie;
    private String idPopulationCible;
    private String idStorage;
    private String idCanaldiffusion;
    private String idFormatAffichage;
    private List<String> secteurcible;
    private String idParametreAction;
    private String titre;
    private String idTypeAffichage;
    private int typeContenue;
    private String externUrl;
    private String description;////
    private String smsBody;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDebut;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFin;
    private int frequence;
    private int statut;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
}
