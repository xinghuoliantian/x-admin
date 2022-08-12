package com.fwzg.quanx.mapper;


import com.fwzg.quanx.entity.Equidlist;
import com.fwzg.quanx.entity.Userequgx;
import com.fwzg.quanx.entity.Useridlist;
import com.fwzg.quanx.vo.UserequQuery;

import java.util.List;

/***
 * 用户设备关系表
 *
 */
public interface UserilMapper {
    List<Useridlist> getAlluserid();
    List<Equidlist>  getAllEquid();

    void addUserEqu(Userequgx userequgx);

    Userequgx  selectUserEqu(Userequgx userequgx);

    List<Userequgx> getUserequList(UserequQuery param);

    Long countUserequList(UserequQuery param);

    void deleteUserequByIds(String ids);
}
