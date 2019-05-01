package com.triphimalaya.triphimalaya.core.user.entity;

import com.triphimalaya.triphimalaya.core.guide.enitity.Guide;
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

    @ManyToMany
    private Set<Guide> guides;

}
