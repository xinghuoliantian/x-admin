package com.fwzg.equipment.mapper;

import com.fwzg.equipment.entity.Equ;
import com.fwzg.equipment.vo.EquQuery;

import java.util.List;

public interface EquMapper {
    List<Equ> getEquList(EquQuery param);

    Long countEquList(EquQuery param);

    void addEqu(Equ equ);

    void deleteEquByIds(String ids);

    Equ getEquById(Integer id);


    void updateEqu(Equ equ);
}
