package com.triphimalaya.triphimalaya.core.site.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Site {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @Lob
    private String details;
    private String longitude;
    private String latitude;
    private String imagePath;
}
