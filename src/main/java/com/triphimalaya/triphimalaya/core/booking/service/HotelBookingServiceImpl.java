package com.triphimalaya.triphimalaya.core.booking.service;

import com.triphimalaya.triphimalaya.core.booking.entity.HotelBooking;
import com.triphimalaya.triphimalaya.core.booking.repository.HotelBookingRepository;
import com.triphimalaya.triphimalaya.core.user.entity.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class HotelBookingServiceImpl implements HotelBookingService {
    private HotelBookingRepository hotelBookingRepository;
    @Override
    public List<HotelBooking> getAllByUser(User user) {
        return hotelBookingRepository.findAllByUser(user);
    }

    @Override
    public HotelBooking save(HotelBooking hotelBooking) {
        return hotelBookingRepository.save(hotelBooking);
    }

    @Override
    public HotelBooking getById(long id) {
        return hotelBookingRepository.getOne(id);
    }

    @Override
    public List<HotelBooking> findAll() {
        return hotelBookingRepository.findAll();
    }

    @Override
    public HotelBooking delete(HotelBooking hotelBooking) {
        hotelBookingRepository.delete(hotelBooking);
        return hotelBooking;
    }
}
