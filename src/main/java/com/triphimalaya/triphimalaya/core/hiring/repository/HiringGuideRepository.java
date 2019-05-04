package com.triphimalaya.triphimalaya.core.hiring.repository;

import com.triphimalaya.triphimalaya.core.hiring.entity.HiringGuide;
import com.triphimalaya.triphimalaya.core.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HiringGuideRepository extends JpaRepository<HiringGuide, Long> {
    List<HiringGuide> findAllByUser(User user);
}
