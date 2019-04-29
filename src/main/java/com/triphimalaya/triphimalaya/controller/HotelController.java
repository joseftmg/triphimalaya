package com.triphimalaya.triphimalaya.controller;

import com.triphimalaya.triphimalaya.core.hotel.enitity.Hotel;
import com.triphimalaya.triphimalaya.core.hotel.service.HotelService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hotel/")
@AllArgsConstructor
public class HotelController {
    private HotelService hotelService;

    @PutMapping(value = "save")
    public ResponseEntity<?> saveHotel(@RequestBody Hotel hotel){
        return new ResponseEntity(hotelService.save(hotel), HttpStatus.OK);
    }

    @GetMapping(value = "getAll")
    public ResponseEntity<?> getAll(){
        return new ResponseEntity(hotelService.findAll(), HttpStatus.OK);
    }

    @DeleteMapping(value = "delete")
    public ResponseEntity<?> delete(@RequestBody Hotel hotel){
        return new ResponseEntity(hotelService.delete(hotel), HttpStatus.OK);
    }

    @GetMapping(value = "getByLocation")
    public ResponseEntity<?> getByLocation(@RequestParam String location){
        return new ResponseEntity(hotelService.findByLocation(location),HttpStatus.OK);
    }
}
