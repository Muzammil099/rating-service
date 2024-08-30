package com.practice.rating.RatingService.services;

import com.practice.rating.RatingService.entities.Rating;

import java.util.List;

public interface RatingService {

    //create
    Rating create(Rating rating);

    //get all ratings
    List<Rating> getAllRatings();

    //get all rating by user id
    List<Rating> getAllByUserId(String userId);

    //get all by hotel id
    List<Rating> getAllByHotelId(String hotelId);
}
