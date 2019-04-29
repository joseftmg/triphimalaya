package com.triphimalaya.triphimalaya.core.hotel.service;

import com.triphimalaya.triphimalaya.core.hotel.enitity.Hotel;
import com.triphimalaya.triphimalaya.core.service.BaseService;

import java.util.List;

public interface HotelService extends BaseService<Hotel> {
    List<Hotel> findByLocation(String location);
}
