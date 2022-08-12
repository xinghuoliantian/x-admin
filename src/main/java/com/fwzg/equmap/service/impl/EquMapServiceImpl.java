package com.fwzg.equmap.service.impl;


import com.fwzg.equmap.entity.EquMap;
import com.fwzg.equmap.mapper.EquMapMapper;
import com.fwzg.equmap.service.EquMapService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class EquMapServiceImpl implements EquMapService {

    @Resource
    private EquMapMapper equMapMapper;

    @Override
    public List<EquMap> getEquMapList() {

        return equMapMapper.getEquMapList();


    }


}
