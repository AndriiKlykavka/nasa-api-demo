package ua.kv.klykavka.andrii.nasaapidemo.models;

import java.net.URL;

public class APOD {
    String date;
    String url;
    String explanation;
    String title;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "APOD{" +
                "date='" + date + '\'' +
                ", url=" + url +
                ", explanation='" + explanation + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
