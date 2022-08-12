package com.fwzg.equmap.controller;


import com.fwzg.common.vo.Result;
import com.fwzg.equmap.entity.EquMap;
import com.fwzg.equmap.service.EquMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/equmap")
public class EquMapController {

    @Autowired
    private EquMapService equMapService;

    String mysz="";

    //返回添加权限页面
    @GetMapping("")
    public String toEquListUI(  )
    {

        return "equmap/equmap";
    }

    //返回查询数据
   // localhost:8081/equmap/list
    @GetMapping("/list")
    @ResponseBody
    public Result<Object> getEquMapList(){

        List<EquMap> list=equMapService.getEquMapList();

        return Result.success(list,10L);

    }

}
