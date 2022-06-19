package com.bprice.persistance.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
@Document
public class Client {
    @Id
    @GeneratedValue(generator = "String2")
    private String idClient;
    private String nom;
    private String prenom;
    private String cin;
    private Date dateNaissance;
    private String genre;
    private String email;
    private String nTel;
    private Short fActive;
    private String type; //PP : personne physique / PM P.morale
    private String matfiscale;
    private String raisonsocial;
    private String numpatente;
    private String siegesocial;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
    private String qrCodeBprice;
    private Double soldeBprice;
    private String adress;

}
