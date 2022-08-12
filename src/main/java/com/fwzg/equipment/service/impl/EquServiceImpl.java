package com.fwzg.equipment.service.impl;

import com.fwzg.equipment.entity.Equ;
import com.fwzg.equipment.entity.Gongk;
import com.fwzg.equipment.mapper.EquMapper;
import com.fwzg.equipment.mapper.GongkMapper;
import com.fwzg.equipment.service.EquService;
import com.fwzg.equipment.vo.EquQuery;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EquServiceImpl implements EquService {

    @Resource
    private EquMapper equMapper;
    @Resource
    private GongkMapper gongkMapper;

    @Override
    public List<Equ> getEquList(EquQuery param) {
        return equMapper.getEquList(param);
    }

    @Override
    public Long countEquList(EquQuery param) {
        return equMapper.countEquList(param);
    }

    @Override
    public void addEqu(Equ equ) {
        equMapper.addEqu(equ);
    }

    @Override
    public List<Gongk> getAllgongk() {
        return gongkMapper.getAllgongk();
    }

    @Override
    public void deleteEquByIds(String ids) {
        equMapper.deleteEquByIds(ids);
    }

    @Override
    public Equ getEquById(Integer id) {
        return equMapper.getEquById(id);
    }

    @Override
    public void updateEqu(Equ equ) {
        equMapper.updateEqu(equ);
    }
}
