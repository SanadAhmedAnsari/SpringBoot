package com.booking.recruitment.hotel.service;

import com.booking.recruitment.hotel.model.City;
import com.booking.recruitment.hotel.model.Hotel;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface CityService {
  List<City> getAllCities();

  City getCityById(Long id);

  City createCity(City city);


    List<Object> getTopThreeClosestHotels(Long id) throws JsonProcessingException;
}
