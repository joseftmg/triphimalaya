package com.triphimalaya.triphimalaya.core.guide.enitity;

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
public class Guide {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String address;

}
