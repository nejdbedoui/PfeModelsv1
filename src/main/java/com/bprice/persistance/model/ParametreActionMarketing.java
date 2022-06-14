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
public class ParametreActionMarketing {
    @Id
    private String idParametreAction;
    private String idActionMarketing;
    private String idUtilisateur;
    private String idPartenaireCible;
    private int prix;
    private int statut;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;

}
