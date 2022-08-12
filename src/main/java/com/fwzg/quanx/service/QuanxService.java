package com.fwzg.quanx.service;


import com.fwzg.quanx.entity.Equidlist;
import com.fwzg.quanx.entity.Userequgx;
import com.fwzg.quanx.entity.Useridlist;
import com.fwzg.quanx.vo.UserequQuery;

import java.util.List;

public interface QuanxService {

    List<Useridlist> getAlluserid();
    List<Equidlist>  getAllequid();

    void addUserEqu(Userequgx userequgx);

    Userequgx selectUserEqu(Userequgx userequgx);

    List<Userequgx> getUserequList(UserequQuery param);

    Long countUserequList(UserequQuery param);

    void deleteUserequByIds(String ids);
}
