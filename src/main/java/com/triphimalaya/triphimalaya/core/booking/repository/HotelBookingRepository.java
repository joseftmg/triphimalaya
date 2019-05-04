package com.triphimalaya.triphimalaya.core.booking.repository;

import com.triphimalaya.triphimalaya.core.booking.entity.HotelBooking;
import com.triphimalaya.triphimalaya.core.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HotelBookingRepository extends JpaRepository<HotelBooking, Long> {
    List<HotelBooking> findAllByUser(User user);
}
