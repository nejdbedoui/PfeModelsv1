package com.bprice.persistance.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
@Document
public class Historique {
    @Id
    private String idHistorique;
    private String idActionmarketing;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    private int action;
    //sms notification
    private int nombreClient;
    //popup banner
    private String idClient;
    private int age;
    private int sexe;
}
