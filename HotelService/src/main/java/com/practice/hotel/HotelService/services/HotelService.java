package com.practice.hotel.HotelService.services;

import com.practice.hotel.HotelService.entities.Hotel;

import java.util.List;

public interface HotelService {

    //hotel operations

    //create hotel
    Hotel saveHotel(Hotel hotel);

    //get all hotels
    List<Hotel> getAllHotels();

    //get hotel by id

    Hotel getHotel(String hotelId);

}
