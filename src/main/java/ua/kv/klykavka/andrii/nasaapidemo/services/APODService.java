package ua.kv.klykavka.andrii.nasaapidemo.services;

import ua.kv.klykavka.andrii.nasaapidemo.models.APOD;

public interface APODService {
    void getPictureByDate(APOD picture);
}
