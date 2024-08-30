package com.practice.hotel.HotelService.controllers;

import com.practice.hotel.HotelService.entities.Hotel;
import com.practice.hotel.HotelService.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    HotelService hotelService;

    @PostMapping
    public ResponseEntity<Hotel> createUser(@RequestBody Hotel hotel){
        Hotel createdHotel = hotelService.saveHotel(hotel);
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(createdHotel);
    }

    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getHotel(@PathVariable String hotelId){

        Hotel hotel = hotelService.getHotel(hotelId);
        return ResponseEntity
            .ok(hotel);
    }

    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotels(){

        List<Hotel> hotels = hotelService.getAllHotels();
        return ResponseEntity
            .ok(hotels);

    }
}
