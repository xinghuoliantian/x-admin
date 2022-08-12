package com.fwzg.quanx.service.impl;


import com.fwzg.quanx.entity.Equidlist;
import com.fwzg.quanx.entity.Userequgx;
import com.fwzg.quanx.entity.Useridlist;
import com.fwzg.quanx.mapper.UserilMapper;
import com.fwzg.quanx.service.QuanxService;
import com.fwzg.quanx.vo.UserequQuery;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class QuanxServiceImpl implements QuanxService {

    @Resource
    private UserilMapper userilMapper;

    @Override
    public List<Useridlist> getAlluserid() {
        return userilMapper.getAlluserid();
    }

    @Override
    public List<Equidlist> getAllequid() {
        return userilMapper.getAllEquid();
    }

    @Override
    public void addUserEqu(Userequgx userequgx) {
        userilMapper.addUserEqu(userequgx);
    }

    @Override
    public Userequgx selectUserEqu(Userequgx userequgx) {
            Userequgx  userequgx1=userilMapper.selectUserEqu(userequgx);
            return userequgx1;
    }

    @Override
    public List<Userequgx> getUserequList(UserequQuery param) {
        return userilMapper.getUserequList(param);
    }

    @Override
    public Long countUserequList(UserequQuery param) {
        return userilMapper.countUserequList(param);
    }

    @Override
    public void deleteUserequByIds(String ids) {
        userilMapper.deleteUserequByIds(ids);
    }


}
