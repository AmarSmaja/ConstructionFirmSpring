package com.construction.constructionfirm.service;

import com.construction.constructionfirm.entity.HQEntity;
import com.construction.constructionfirm.repos.HQRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HQService {

    @Autowired
    private HQRepo hqRepo;

    public List<HQEntity> getAllHQ() {
        List<HQEntity> hq = hqRepo.findAll();
        return hq;
    }

    public HQEntity saveHQ(HQEntity hqEntity) {
        return hqRepo.save(hqEntity);
    }
}