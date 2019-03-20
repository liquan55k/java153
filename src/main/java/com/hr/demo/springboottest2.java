package com.hr.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test2")
public class springboottest2 {
        @RequestMapping("/tojsp")
        public ModelAndView tojsp(){
            System.out.println("龙声九天");
            ModelAndView mv = new ModelAndView("index");
            mv.addObject("name","诸葛恪");
            return  mv;
        }
}
