package com.practice.hotel.HotelService.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "Hotels")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Hotel {

    @Id
    @Column(name = "HOTEL_ID")
    private String hotelId;
    @Column(name = "NAME")
    private String name;
    @Column(name = "LOCATION")
    private String location;
    @Column(name = "ABOUT")
    private String about;
}
