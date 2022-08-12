package com.fwzg.quanx.controller;

import com.fwzg.common.vo.Result;

import com.fwzg.quanx.entity.Equidlist;
import com.fwzg.quanx.entity.Userequgx;
import com.fwzg.quanx.entity.Useridlist;
import com.fwzg.quanx.service.QuanxService;
import com.fwzg.quanx.vo.UserequQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/quanx")
public class QuanController {

    @Autowired
    private QuanxService quanxService;
    //返回添加权限页面
    @GetMapping("")
    public String toEquListUI(Model model)
    {
        List<Useridlist>  useridlists =quanxService.getAlluserid();
        model.addAttribute("useridList",useridlists);
        List<Equidlist>  equidlists =quanxService.getAllequid();
        model.addAttribute("equidlists",equidlists);
        return "quanx/quanxedit";
    }



    //执行新增并返回结果
    @PostMapping("")
    @ResponseBody
    public Result  addUserEqu(Userequgx userequgx){

        Userequgx userequgx1=quanxService.selectUserEqu(userequgx);
        if (userequgx1==null) {
            quanxService.addUserEqu(userequgx);
            return Result.success("新增权限成功！");
        }
        else {
            return Result.fail("用户设备关系已存在！");
        }
    }


    //返回权限删除
    @GetMapping("/quanx2")
    public String toEquListUI2()
    {

        return "quanx/quanxedit2";
    }

    //返回查询数据
    //http://localhost:8081/index#/quanx/quanx2/list?page=1&limit=10&deviceID=10200702
    @GetMapping("/quanx2/list")
    @ResponseBody
    public Result<Object> getUserequList(UserequQuery param){

        List<Userequgx> list=quanxService.getUserequList(param);
        Long count=quanxService.countUserequList(param);
        return Result.success(list,count);
    }

    //执行删除并返回结果
    @DeleteMapping("/{ids}")
    @ResponseBody
    public Result<Object> deleteUserequByIds(@PathVariable("ids") String ids)
    {
        quanxService.deleteUserequByIds(ids);
        return Result.success("删除设备成功！");
    }

}
