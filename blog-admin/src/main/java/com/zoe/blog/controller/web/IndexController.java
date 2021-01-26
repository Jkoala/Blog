package com.zoe.blog.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author devin
 * @version 1.0.2
 * @date 2021-01-25 22:45
 */
@Controller
public class IndexController {

    @ResponseBody
    @RequestMapping("/")
    public String Index(){
        return "hello";
    }
}
