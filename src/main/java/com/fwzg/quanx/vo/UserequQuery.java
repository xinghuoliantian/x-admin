package com.fwzg.quanx.vo;

import com.fwzg.common.vo.Page;
import lombok.Data;

@Data
public class UserequQuery extends Page {
    private Integer  USERID;
    private String deviceID;
}
