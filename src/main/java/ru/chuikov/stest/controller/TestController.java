package ru.chuikov.stest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.chuikov.stest.entity.Test;
import ru.chuikov.stest.service.TestService;
import ru.chuikov.stest.service.impl.TestServiceImpl;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(path = "/test")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping()
    public String index(ModelMap modelMap){
        Optional<List<Test>> tests=testService.getAll();
        if(tests.isPresent()) modelMap.addAttribute("tests",tests.get());
        else modelMap.addAttribute("tests",new Test());
        return "tests";
    }

    @GetMapping(path = "/add")
    public String add(ModelMap modelMap){
        modelMap.addAttribute("test",new Test());
        return "addTest";
    }
}
