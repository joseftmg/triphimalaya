package com.triphimalaya.triphimalaya.core.hiring.service;

import com.triphimalaya.triphimalaya.core.hiring.entity.HiringGuide;
import com.triphimalaya.triphimalaya.core.service.BaseService;
import com.triphimalaya.triphimalaya.core.user.entity.User;

import java.util.List;

public interface HiringGuideService extends BaseService<HiringGuide> {
    List<HiringGuide> getAllByUser(User user);
}
