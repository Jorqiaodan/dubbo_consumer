package com.itheima.contrller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.service.DubboService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/say")
@org.springframework.stereotype.Controller
public class Controller {
    @Reference
    private DubboService dubboService;

    @RequestMapping("/hello")
    @ResponseBody
    public String getName(String name){
        String sayHello = dubboService.sayHello(name);
        System.out.println(sayHello);
        return sayHello;
    }
}
