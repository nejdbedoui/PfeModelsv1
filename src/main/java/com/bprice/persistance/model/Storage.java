package com.bprice.persistance.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document
public class Storage {
    @Id
    private String idStorage;
    private String name;
    private String type;
    private String url;
    private long size;

}
