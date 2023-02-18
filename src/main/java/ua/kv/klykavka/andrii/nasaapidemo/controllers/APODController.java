package ua.kv.klykavka.andrii.nasaapidemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import ua.kv.klykavka.andrii.nasaapidemo.models.APOD;
import ua.kv.klykavka.andrii.nasaapidemo.services.APODService;
import ua.kv.klykavka.andrii.nasaapidemo.services.NasaAPODService;

import java.net.MalformedURLException;

@Controller("/pictures")
public class APODController {

    private final NasaAPODService apodService;

    public APODController(NasaAPODService apodService) {
        this.apodService = apodService;
    }

    @GetMapping("/pictures/daily")
    public String getPictureByTheDay(@ModelAttribute("APOD") APOD picture) {
        System.out.println("cp 2");
        apodService.getPictureByDate(picture);
        System.out.println("picture: " + picture);
        return "daily-picture";
    }
}
