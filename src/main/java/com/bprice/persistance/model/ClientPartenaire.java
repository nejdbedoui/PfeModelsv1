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
public class ClientPartenaire {
    @Id
    @GeneratedValue(generator = "String2")
    private String idClientPartenaire;
    private String idClient;
    private String idPartenaire;
    private String qrCodePartn;
    private Double soldePartn;
    private short isActif;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
    private String idJournee;
    private String nom;
    private String prenom;
    private Integer nbrAlimentationFidelite;
    private String tokenNotification;
    private String password;
    private short isconnected;
    private String srcCreation;
    private String idGroupeClientPartenaire;
    private String raisonsocial;
    private String matfiscale;
    private String adress;
    private String image;
}
