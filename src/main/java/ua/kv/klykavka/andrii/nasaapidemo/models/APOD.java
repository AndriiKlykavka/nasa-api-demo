package ua.kv.klykavka.andrii.nasaapidemo.models;

import java.net.URL;

public class APOD {
    String date;
    String copyright;
    String mediaType;
    URL hdurl;
    String serviceVersion;
    String explanation;
    String title;
    URL url;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public URL getHdurl() {
        return hdurl;
    }

    public void setHdurl(URL hdurl) {
        this.hdurl = hdurl;
    }

    public String getServiceVersion() {
        return serviceVersion;
    }

    public void setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
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

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "APOD{" +
                "date='" + date + '\'' +
                ", copyright='" + copyright + '\'' +
                ", mediaType='" + mediaType + '\'' +
                ", hdurl=" + hdurl +
                ", serviceVersion='" + serviceVersion + '\'' +
                ", explanation='" + explanation + '\'' +
                ", title='" + title + '\'' +
                ", url=" + url +
                '}';
    }
}
