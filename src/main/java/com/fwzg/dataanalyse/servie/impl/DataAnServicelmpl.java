package com.fwzg.dataanalyse.servie.impl;

import com.fwzg.dataanalyse.entity.Equd;
import com.fwzg.dataanalyse.mapper.EqudMapper;
import com.fwzg.dataanalyse.servie.DataAnService;
import com.fwzg.dataanalyse.vo.EqudQuery;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class DataAnServicelmpl implements DataAnService {

    @Resource
    private EqudMapper equdMapper;

    @Override
    public List<Equd> getEquList(EqudQuery param) {
        return equdMapper.getEqudList(param);
    }

    @Override
    public Long countEquList(EqudQuery param) {
        return equdMapper.countEqudList(param);
    }

    @Override
    public List<Equd> getAllEqud() {
        return equdMapper.getAllEqud();
    }
}
