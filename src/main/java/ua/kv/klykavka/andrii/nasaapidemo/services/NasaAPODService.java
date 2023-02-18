package ua.kv.klykavka.andrii.nasaapidemo.services;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import ua.kv.klykavka.andrii.nasaapidemo.models.APOD;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

@Service
public class NasaAPODService implements APODService{

    @Override
    public void getPictureByDate(APOD picture) {
        JSONObject jsonObject;
        try {
            URL url = new URL("https://api.nasa.gov/planetary/apod?api_key=aY6M30Gt5hgFtYclf0EfeHlHFGUk687q0ErtGNf9");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("HttpResponseCode: " + conn.getResponseCode());
            }

            StringBuilder informationString = new StringBuilder();
            Scanner scanner = new Scanner(url.openStream());

            while (scanner.hasNext()) {
                informationString.append(scanner.nextLine());
            }

            scanner.close();


            JSONParser parse = new JSONParser();
            jsonObject = (JSONObject) parse.parse(String.valueOf(informationString));
            System.out.println("======================");
            System.out.println(jsonObject);
            System.out.println(jsonObject.get(0));
            System.out.println("======================");
//            picture.setDate(dataObject.get(0).toString());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
