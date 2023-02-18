package ua.kv.klykavka.andrii.nasaapidemo.config;

import org.json.simple.JSONArray;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ua.kv.klykavka.andrii.nasaapidemo.services.APODService;
import ua.kv.klykavka.andrii.nasaapidemo.services.NasaAPODService;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

@Configuration
public class ApplicationConfig {

    @Bean
    public APODService getAPODService() {
        return new NasaAPODService();
    }

}
