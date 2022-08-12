package com.fwzg.dataanalyse.entity;

import lombok.Data;

import java.io.Serializable;


@Data
public class Equd implements Serializable {
    private Integer  ID;
    private String deviceID;
    private String count;

}
