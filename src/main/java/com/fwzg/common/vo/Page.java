package com.fwzg.common.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Page implements Serializable {
    private Integer page;
    private Integer limit;
    private Long start;

    public Long getStart(){

        this.start= (page-1L)*limit;
        return start;
    }
}
