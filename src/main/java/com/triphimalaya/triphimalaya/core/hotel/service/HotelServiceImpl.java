package com.triphimalaya.triphimalaya.core.hotel.service;

import com.triphimalaya.triphimalaya.core.hotel.enitity.Hotel;
import com.triphimalaya.triphimalaya.core.hotel.repository.HotelRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class HotelServiceImpl implements HotelService {

    private HotelRepository hotelRepository;

    @Override
    public Hotel save(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel getById(long id) {
        return hotelRepository.getOne(id);
    }

    @Override
    public List<Hotel> findAll() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel delete(Hotel hotel) {
        hotelRepository.delete(hotel);
        return hotel;
    }

    @Override
    public List<Hotel> findByLocation(String location){
        return hotelRepository.findAllByLocation(location);
    }

}
