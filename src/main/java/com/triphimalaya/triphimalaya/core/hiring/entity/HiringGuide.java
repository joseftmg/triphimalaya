package com.triphimalaya.triphimalaya.core.hiring.entity;

import com.triphimalaya.triphimalaya.core.guide.enitity.Guide;
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
public class HiringGuide {
    @Id
    @GeneratedValue
    private long id;
    @OneToOne
    private User user;
    @OneToOne
    private Guide guide;
    private Date hireDate;
    private Date till;
    private int numberOfDays;

}
