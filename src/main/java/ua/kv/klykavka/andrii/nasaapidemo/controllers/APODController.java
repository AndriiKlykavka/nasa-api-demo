package ua.kv.klykavka.andrii.nasaapidemo.controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.kv.klykavka.andrii.nasaapidemo.models.APOD;

@Controller
@RequestMapping("/apod")
public class APODController {

    @RequestMapping("/showOptions")
    public String showApodOptions(Model model) {
        model.addAttribute("apod", new APOD());
        return "apod-options";
    }



    @RequestMapping("/dailyApod")
    public String processDailyApod(@ModelAttribute("apod") APOD apod) {
        try {
            OkHttpClient client = new OkHttpClient();
            String APOD_URL = "https://api.nasa.gov/planetary/apod?api_key=aY6M30Gt5hgFtYclf0EfeHlHFGUk687q0ErtGNf9";
            Request request = new Request.Builder()
                    .url(APOD_URL)
                    .build();

            Response response = client.newCall(request).execute();
            ObjectMapper mapper = new ObjectMapper();
            JsonNode responseJson = mapper.readTree(response.body().string());

            String date = responseJson.get("date").asText();
            String imageUrl = responseJson.get("url").asText();
            String explanation = responseJson.get("explanation").asText();
            String title = responseJson.get("title").asText();

            apod.setDate(date);
            apod.setUrl(imageUrl);
            apod.setExplanation(explanation);
            apod.setTitle(title);

            System.out.println();

        } catch (Exception e) {
            throw new RuntimeException("No connection!");
        }
        return "apod-result";
    }
}
