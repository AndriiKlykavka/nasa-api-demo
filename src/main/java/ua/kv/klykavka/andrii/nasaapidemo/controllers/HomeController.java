package ua.kv.klykavka.andrii.nasaapidemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.kv.klykavka.andrii.nasaapidemo.models.APOD;


@Controller("/")
public class HomeController {

    @RequestMapping("/")
    public String showMainMenu(Model model) {
        model.addAttribute("APOD", new APOD());
        System.out.println("ckeckpoit 1");
        return "main-menu";
    }
}
