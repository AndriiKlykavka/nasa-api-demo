package ua.kv.klykavka.andrii.nasaapidemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping("/")
    public String showMainMenu() {
        return "main-menu";
    }
}
