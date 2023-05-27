package com.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
@SessionAttributes(value = "asd")
public class HelloController {


    @RequestMapping(path = "/springMVC")
    public  ModelAndView sayHello(){
        ModelAndView model= new ModelAndView();
        System.out.println("hello SpringMVC");
        String user = "123456";
       model.addObject("asd","哈哈");
       model.setViewName("login");
       model.addObject("123456");
       return model;
    }



}
