package com.triphimalaya.triphimalaya.core.hiring.service;

import com.triphimalaya.triphimalaya.core.hiring.entity.HiringGuide;
import com.triphimalaya.triphimalaya.core.hiring.repository.HiringGuideRepository;
import com.triphimalaya.triphimalaya.core.user.entity.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class HiringGuideServiceImpl implements HiringGuideService {
    private HiringGuideRepository hiringGuideRepository;

    @Override
    public List<HiringGuide> getAllByUser(User user) {
        return hiringGuideRepository.findAllByUser(user);
    }

    @Override
    public HiringGuide save(HiringGuide hiringGuide) {
        return hiringGuideRepository.save(hiringGuide);
    }

    @Override
    public HiringGuide getById(long id) {
        return hiringGuideRepository.getOne(id);
    }

    @Override
    public List<HiringGuide> findAll() {
        return hiringGuideRepository.findAll();
    }

    @Override
    public HiringGuide delete(HiringGuide hiringGuide) {
        hiringGuideRepository.delete(hiringGuide);
        return hiringGuide;
    }
}
