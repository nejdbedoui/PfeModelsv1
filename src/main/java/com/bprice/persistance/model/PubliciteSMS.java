package com.bprice.persistance.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
@Document
public class PubliciteSMS {
    @Id
    private String idPubliciteSMS;
    private String idActionMarketing;
    private String numeroCible;
    private String body;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateEnvoi;
}
