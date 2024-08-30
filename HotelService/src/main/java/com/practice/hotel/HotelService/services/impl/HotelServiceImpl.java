package com.practice.hotel.HotelService.services.impl;

import com.practice.hotel.HotelService.entities.Hotel;
import com.practice.hotel.HotelService.exceptions.ResourceNotFoundException;
import com.practice.hotel.HotelService.repositories.HotelRepository;
import com.practice.hotel.HotelService.services.HotelService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    HotelRepository hotelRepository;
    @Override
    public Hotel saveHotel(Hotel hotel) {

        hotel.setHotelId(UUID.randomUUID().toString());
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @SneakyThrows
    @Override
    public Hotel getHotel(String hotelId) {
        return hotelRepository.findById(hotelId).orElseThrow(
                () -> new ResourceNotFoundException("Resource not found with id: "+ hotelId)
        );
    }
}
