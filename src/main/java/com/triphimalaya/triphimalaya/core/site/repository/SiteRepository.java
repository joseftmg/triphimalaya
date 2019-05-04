package com.triphimalaya.triphimalaya.core.site.repository;

import com.triphimalaya.triphimalaya.core.site.entity.Site;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SiteRepository extends JpaRepository<Site, Long> {
    List<Site> findAllByName(String name);
}
