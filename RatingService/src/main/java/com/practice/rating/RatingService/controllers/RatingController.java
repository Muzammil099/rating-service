package com.practice.rating.RatingService.controllers;

import com.practice.rating.RatingService.entities.Rating;
import com.practice.rating.RatingService.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    RatingService ratingService;

    @PostMapping
    public ResponseEntity<Rating> create(@RequestBody Rating rating){
        Rating createdRating = ratingService.create(rating);
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(createdRating);
    }

    @GetMapping
    public ResponseEntity<List<Rating>> getAll(){
        List<Rating> ratings = ratingService.getAllRatings();
        return ResponseEntity.ok(ratings);
    }


    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>> getAllByUserId(@PathVariable String userId){
        List<Rating> ratings = ratingService.getAllByUserId(userId);
        return ResponseEntity.ok(ratings);
    }


    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getAllByHotelId(@PathVariable String hotelId){
        List<Rating> ratings = ratingService.getAllByHotelId(hotelId);
        return ResponseEntity.ok(ratings);
    }


}
