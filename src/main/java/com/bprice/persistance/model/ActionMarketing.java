package com.bprice.persistance.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
@Document
public class ActionMarketing {
    @Id
    private String idActionMarketing;
    private String idPartenaire;
    private String url;
    private String description;
    private String smsBody;
    private String libelleCanalDiffusion;//tv mobile sms
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDebut;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFin;
    private int frequence;
    private String typeAffichageMobile;//pop up banniere notification
    private String typeContenue; //image video
    private String statut;//crée ,accepter ,refuser ,en cours diffusion
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
}
