package com.triphimalaya.triphimalaya.core.booking.entity;

import com.triphimalaya.triphimalaya.core.hotel.enitity.Hotel;
import com.triphimalaya.triphimalaya.core.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class HotelBooking {
    @Id
    @GeneratedValue
    private long id;
    @OneToOne
    private User user;
    @OneToOne
    private Hotel hotel;
    private Date bookedDate;


}
