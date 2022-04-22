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
    private String IdActionMarketing;
    private String IdPartenaire;
    private String Url;
    private String Description;
    private String SMSBody;
    private String LibelleCanalDiffusion;//tv mobile sms
    @Temporal(TemporalType.TIMESTAMP)
    private Date DateDebut;
    @Temporal(TemporalType.TIMESTAMP)
    private Date DateFin;
    private int Frequence;
    private String TypeAffichageMobile;//pop up banniere notification
    private String TypeContenue; //image video
    private String Statut;//crée ,accepter ,refuser ,en cours diffusion
    @Temporal(TemporalType.TIMESTAMP)
    private Date DateCreation;
}
