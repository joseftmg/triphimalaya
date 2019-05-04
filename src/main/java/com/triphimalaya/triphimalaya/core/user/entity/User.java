package com.triphimalaya.triphimalaya.core.user.entity;

import com.triphimalaya.triphimalaya.core.guide.enitity.Guide;
import com.triphimalaya.triphimalaya.core.hotel.enitity.Hotel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String address;
    private String email;
    private String password;
    private String contactNo;
    @ManyToMany
    private Set<Guide> guides;

    @ManyToMany
    private Set<Hotel> hotels;

}
