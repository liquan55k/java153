package com.hr.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;

@Controller
@ResponseBody
@RequestMapping("/springboot")
public class springboottest {
            @Autowired
            private PersonProperties personProperties;

            @Value("${jdbcUrl}")
            private String jdbcUrl;

//            @RequestMapping("/test1")
//            @ResponseBody
//        private String test1(){
//            System.out.println("玫瑰你在那里");
//            return "name=  "+name+"        age"+age;
//        }
            @RequestMapping("/say1")
           // @ResponseBody
            private  String say1(){
                return personProperties.toString()+" jdbcUrl "+jdbcUrl;
            }
            @RequestMapping(value = {"/lq","say2"},method = RequestMethod.GET)
            private String say2(){
                return "命名空间是lq或者say2的get请求才可以进来";
            }

            @RequestMapping("/say3/{id}")
            private String say3(@PathVariable("id") Integer myid){
                System.out.println("myid========="+myid);
                return "命名空间必须是say3并且带有一个参数";
            }

            @RequestMapping("/{id}/say4/{age}")
            private String say4(@PathVariable("id") Integer myid,@PathVariable("age") Integer age) {
                System.out.println("myid=====" + myid + "     age" + age);
                return "命名空间必须是say4且前面和后面必须带有一个参数";
            }

            @RequestMapping("/say5")
            private String say5(@RequestParam(value ="id",required = false,defaultValue ="153") Integer myid){
                System.out.println("myid======"+myid);
                return "命名空间为say5，如果不带有参数则用默认参数153，如果有必须是?id=X";
            }
}
