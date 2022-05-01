package com.bprice.persistance.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Lob;
import java.io.InputStream;

@Data
@Document
public class Storage {
    @Id
    private String idStorage;
    private String name;
    private String type;
    private long size;

}