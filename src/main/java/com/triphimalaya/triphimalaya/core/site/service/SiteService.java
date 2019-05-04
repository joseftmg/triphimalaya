package com.triphimalaya.triphimalaya.core.site.service;

import com.triphimalaya.triphimalaya.core.service.BaseService;
import com.triphimalaya.triphimalaya.core.site.entity.Site;

import java.util.List;

public interface SiteService extends BaseService<Site> {
    List<Site> findAllByName(String name);

}
