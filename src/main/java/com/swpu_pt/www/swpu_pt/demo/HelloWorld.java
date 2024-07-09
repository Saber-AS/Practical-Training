package com.swpu_pt.www.swpu_pt.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller/*@Controller是一个控制层注解，表示这个类是一个控制层类*/
public class HelloWorld {

    @RequestMapping("/www.swpu_pt")/*这表示一个url地址，来接受用户请求*/
    @ResponseBody
    public String hellloWorld(){
        System.out.println("Hello World--------你好，世界！");
        return "Hello World--------你好，世界！";
    }
}
