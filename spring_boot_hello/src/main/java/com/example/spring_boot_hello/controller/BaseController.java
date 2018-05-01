package com.example.spring_boot_hello.controller;

import com.example.spring_boot_hello.bean.GlobalConfig;
import com.example.spring_boot_hello.bean.MenuConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {
    @Autowired
    private GlobalConfig globalConfig;

    @Autowired
    private MenuConfig menuConfig;

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("message", message);
        model.addAttribute("name",globalConfig.getName());
        model.addAttribute("facebook",globalConfig.getFacebook());
        model.addAttribute("website",globalConfig.getWebsite());
        model.addAttribute("menus", menuConfig.getMenus());
        return "index";
    }

    @Value("${message}")
    public String message;
}
