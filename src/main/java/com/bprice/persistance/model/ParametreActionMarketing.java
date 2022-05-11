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
    List<String> listeidPartenaire;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;

}
