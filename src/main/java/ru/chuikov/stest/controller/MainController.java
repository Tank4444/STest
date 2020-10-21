package ru.chuikov.stest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.chuikov.stest.entity.User;
import ru.chuikov.stest.service.UserService;
import ru.chuikov.stest.validator.RegistrationValidator;

@Controller
public class MainController {

    private final RegistrationValidator registrationValidator;

    private final UserService userService;

    public MainController(RegistrationValidator registrationValidator, UserService userService) {
        this.registrationValidator = registrationValidator;
        this.userService = userService;
    }

    @GetMapping(value = {"/","/index"})
    public String index(ModelMap model) {

        String message = "Hello Spring Boot + JSP";

        model.addAttribute("message", message);

        return "index";
    }
    @GetMapping(value = "/login")
    public String login(ModelMap modelMap){

        return "login";
    }
    @GetMapping(value = "/logout")
    public String logout(ModelMap modelMap){

        return "logout";
    }

    @GetMapping(value = "/registration")
    public String registration(ModelMap modelMap){
        modelMap.addAttribute("user",new User());
        return "registration";
    }

    @PostMapping(value = "/registration")
    public  String registration(@ModelAttribute() User newUser, BindingResult bindingResult){
        registrationValidator.validate(newUser, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        userService.add(newUser);
        return "redirect:/login";
    }
}
