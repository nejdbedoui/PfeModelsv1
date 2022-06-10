package com.bprice.persistance.model;
import org.springframework.data.annotation.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
@Document
public class DemandeActionMarketing {
    @Id
    String idDemandeActionMarketing;
    String idPartenaire;
    private int statut;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
}
