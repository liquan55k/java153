package com.hr.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/springboot1")
public class test {
        @RequestMapping("/test1")
        public void test1(){
            System.out.println("现在走");
        }

}
