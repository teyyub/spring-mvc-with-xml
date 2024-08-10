package org.mvc.sample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
//    @GetMapping(value = "/hello")
    public String hello(ModelMap modelMap){
       modelMap.addAttribute("message","welcome spring mvc!!!");
       return "index";
    }

}
