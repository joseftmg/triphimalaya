package com.triphimalaya.triphimalaya.core.hotel.enitity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Hotel {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String contactNp;
    private boolean isWifi;
    private boolean isShower;
    private boolean isCharging;
    private boolean isToiler;
    private String room;
    private String latitude;
    private String longitude;
    private String location;
    private String imagePath;
}
