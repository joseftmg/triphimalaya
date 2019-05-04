package com.triphimalaya.triphimalaya.core.site.service;

import com.triphimalaya.triphimalaya.core.site.entity.Site;
import com.triphimalaya.triphimalaya.core.site.repository.SiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SiteServiceImpl implements SiteService {
    private SiteRepository siteRepository;
    @Override
    public Site save(Site site) {
        return siteRepository.save(site);
    }

    @Override
    public Site getById(long id) {
        return siteRepository.getOne(id);
    }

    @Override
    public List<Site> findAll() {
        return siteRepository.findAll();
    }

    @Override
    public Site delete(Site site) {
        siteRepository.delete(site);
        return site;
    }

    @Override
    public List<Site> findAllByName(String name) {
        return siteRepository.findAllByName(name);
    }
}
