package com.triphimalaya.triphimalaya.core.guide.repository;

import com.triphimalaya.triphimalaya.core.guide.enitity.Guide;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GuideRepository extends JpaRepository<Guide, Long> {
    List<Guide> findAllByAddress(String address);
}
