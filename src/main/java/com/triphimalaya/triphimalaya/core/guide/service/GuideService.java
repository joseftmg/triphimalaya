package com.triphimalaya.triphimalaya.core.guide.service;

import com.triphimalaya.triphimalaya.core.guide.enitity.Guide;
import com.triphimalaya.triphimalaya.core.service.BaseService;

import java.util.List;

public interface GuideService extends BaseService<Guide> {
    List<Guide> findByLocation(String location);
}
