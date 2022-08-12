package com.fwzg.equipment.controller;


import com.fwzg.common.vo.Result;
import com.fwzg.equipment.entity.Equ;
import com.fwzg.equipment.entity.Gongk;
import com.fwzg.equipment.service.EquService;
import com.fwzg.equipment.vo.EquQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/equ")
public class EquController {

    @Autowired
    private EquService equService;

    //返回查询页面
    @GetMapping("")
    public String toEquListUI()
    {
        return "equ/equList";
    }
    //返回查询数据
    //  localhost:8081/equ/list?page=1&limit=10
    @GetMapping("/list")
    @ResponseBody
    public Result<Object> getEquList(EquQuery param){
        List<Equ> list=equService.getEquList(param);
        Long count=equService.countEquList(param);
        return Result.success(list,count);
    }
    //执行新增并返回结果
    @PostMapping("")
    @ResponseBody
    public Result<Object> addEqu(Equ equ){
         equService.addEqu(equ);
         return Result.success("新增设备成功！");
    }
    //返回新增界面
    @GetMapping("/add/ui")
    public String toAddUI(Model model)
    {
        List<Gongk> gongkList =equService.getAllgongk();
        model.addAttribute("gongkList",gongkList);
        return "equ/equAdd";
    }
    //执行删除并返回结果
    @DeleteMapping("/{ids}")
    @ResponseBody
    public Result<Object> deleteEquByIds(@PathVariable("ids") String ids)
    {
        equService.deleteEquByIds(ids);
        return Result.success("删除设备成功！");
    }
    //返回修改界面
    @GetMapping("/{id}")
    public String getEquById(@PathVariable("id") Integer id, Model model) {
        Equ equ = equService.getEquById(id);
        model.addAttribute("equ", equ);
        model.addAttribute("gongkList",equService.getAllgongk());
        return "equ/equEdit";
    }
    //执行修改并返回结果
    @PutMapping("")
    @ResponseBody
    public Result<Object> updateEqu(Equ equ) {
        equService.updateEqu(equ);
        return Result.success("设备信息修改成功!");
    }


}














