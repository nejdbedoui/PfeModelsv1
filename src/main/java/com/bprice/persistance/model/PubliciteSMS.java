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
    private String IdPubliciteSMS;
    private String IdActionMarketing;
    private String NumeroCible;
    private String Body;
    @Temporal(TemporalType.TIMESTAMP)
    private Date DateEnvoi;
}
