package canger.study.testweb.controller;

import canger.study.testweb.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Controller
@RequestMapping("/first")
@SessionScope
public class TestController {
    @Autowired
    public TestService testService;

    @RequestMapping
    @ResponseBody
    public String test(){
        System.out.println(this);
        testService.find();
        testService.find();
        return "Hello Test";
    }

}
