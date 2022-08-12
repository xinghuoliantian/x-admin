package com.fwzg.user.controller;


import com.fwzg.common.vo.Result;
import com.fwzg.user.entity.User;
import com.fwzg.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    HttpSession session;
    @PostMapping("/login")
    public Result login(User param,HttpSession session)
    {
        User user=userService.login(param);
        if (user!=null){
            user.setPassword(null);
            session.setAttribute( "userInfo",user);

            return Result.success();
        }
        return Result.fail("登录失败！");

    }

}
