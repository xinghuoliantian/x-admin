package com.fwzg.dataanalyse.controller;

import com.fwzg.common.vo.Result;
import com.fwzg.dataanalyse.entity.Equd;
import com.fwzg.dataanalyse.servie.DataAnService;
import com.fwzg.dataanalyse.vo.EqudQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/dataan")
public class DataAnController {

    @Autowired
    private DataAnService dataAnService;
    //返回页面
    @GetMapping("")
    public String toEquListUI( Model model )
    {
        List<Equd> EqudList =dataAnService.getAllEqud();
        model.addAttribute("EqudList",EqudList);
        return "dataan/dataan1";
    }
    //返回查询数据
    //  localhost:8081/dataan/list?page=1&limit=10
    //  localhost:8081/dataan/list?page=1&limit=10&deviceID=11202002
     @GetMapping("/list")
     @ResponseBody
    public Result<Object> getEquList(EqudQuery param){

        List<Equd> list=dataAnService.getEquList(param);
        Long count=dataAnService.countEquList(param);
        return Result.success(list,count);
    }

}
