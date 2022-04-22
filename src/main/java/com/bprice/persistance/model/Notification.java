package com.bprice.persistance.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
@Document
public class Notification {
    @Id
    private String IdNotfication;
    private String IdActionMarketing;
    private String IdApplicationCible;
    private String TypeNotification;
    private String Body;
    @Temporal(TemporalType.TIMESTAMP)
    private Date DateEnvoi;
}
