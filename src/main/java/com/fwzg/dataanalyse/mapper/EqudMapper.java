package com.fwzg.dataanalyse.mapper;

import com.fwzg.dataanalyse.entity.Equd;
import com.fwzg.dataanalyse.vo.EqudQuery;

import java.util.List;

public interface EqudMapper {

    List<Equd> getEqudList(EqudQuery param);

    Long countEqudList(EqudQuery param);

    List<Equd> getAllEqud();
}
