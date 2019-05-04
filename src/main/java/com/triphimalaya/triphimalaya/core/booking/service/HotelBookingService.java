package com.triphimalaya.triphimalaya.core.booking.service;

import com.triphimalaya.triphimalaya.core.booking.entity.HotelBooking;
import com.triphimalaya.triphimalaya.core.service.BaseService;
import com.triphimalaya.triphimalaya.core.user.entity.User;

import java.util.List;

public interface HotelBookingService extends BaseService<HotelBooking> {
    List<HotelBooking> getAllByUser(User user);
}

