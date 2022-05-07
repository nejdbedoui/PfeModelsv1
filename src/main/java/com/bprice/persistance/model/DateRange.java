package com.bprice.persistance.model;

import lombok.Data;

import java.util.Date;

@Data
public class DateRange {
    private String id;
    private Date DateDebut;
    private Date DateFin;
}
