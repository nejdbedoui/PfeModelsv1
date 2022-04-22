package com.bprice.persistance.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
@Document
public class PubliciteTV {
    @Id
    private String IdPubliciteTV;
    private String IdActionMarketing;
    private String NumeroFireBase;
    @Temporal(TemporalType.TIMESTAMP)
    private Date DateDiffusion;
}
