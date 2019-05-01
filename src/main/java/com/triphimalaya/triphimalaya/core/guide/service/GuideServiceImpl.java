package com.triphimalaya.triphimalaya.core.guide.service;

import com.triphimalaya.triphimalaya.core.guide.enitity.Guide;
import com.triphimalaya.triphimalaya.core.guide.repository.GuideRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GuideServiceImpl implements GuideService{
    private GuideRepository guideRepository;
    @Override
    public Guide save(Guide guide) {
        return guideRepository.save(guide);
    }

    @Override
    public Guide getById(long id) {
        return guideRepository.getOne(id);
    }

    @Override
    public List<Guide> findAll() {
        return guideRepository.findAll();
    }

    @Override
    public Guide delete(Guide guide) {
        guideRepository.delete(guide);
        return guide;
    }

    @Override
    public List<Guide> findByLocation(String location) {
        return guideRepository.findAllByAddress(location);
    }
}
