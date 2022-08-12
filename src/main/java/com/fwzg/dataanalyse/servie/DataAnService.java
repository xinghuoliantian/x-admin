package com.fwzg.dataanalyse.servie;


import com.fwzg.dataanalyse.entity.Equd;
import com.fwzg.dataanalyse.vo.EqudQuery;


import java.util.List;

public interface DataAnService {

     Long countEquList(EqudQuery param);
    List<Equd> getAllEqud();
     List<Equd> getEquList(EqudQuery param);
}
