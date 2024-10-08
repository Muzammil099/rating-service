package com.practice.rating.RatingService;

import com.practice.rating.RatingService.entities.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RatingRepository extends MongoRepository<Rating, String> {

    List<Rating> findAllByUserId(String userId);
    List<Rating> findAllByHotelId(String hotelId);
}
