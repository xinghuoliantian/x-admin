package com.fwzg.common.exception;


import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author: Zhao
 * @CreateTime: 2022/06/01
 */

@Controller
public class NotFoundController implements ErrorController {


    public String getErrorPath() {
        return "/error";
    }

    @RequestMapping("/error")
     public String error404() {
        return "error/404";
    }
}
