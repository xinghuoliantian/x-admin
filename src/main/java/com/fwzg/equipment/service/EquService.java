package com.fwzg.equipment.service;

import com.fwzg.equipment.entity.Equ;
import com.fwzg.equipment.entity.Gongk;
import com.fwzg.equipment.vo.EquQuery;

import java.util.List;

public interface EquService {
    List<Equ> getEquList(EquQuery param);

    Long countEquList(EquQuery param);

    void addEqu(Equ equ);

    List<Gongk> getAllgongk();

    void deleteEquByIds(String ids);

    Equ getEquById(Integer id);

    void updateEqu(Equ equ);


}
