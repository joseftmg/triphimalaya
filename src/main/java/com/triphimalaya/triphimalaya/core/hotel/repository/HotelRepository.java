package com.triphimalaya.triphimalaya.core.hotel.repository;

import com.triphimalaya.triphimalaya.core.hotel.enitity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
    List<Hotel> findAllByLocation(String location);
}
