package com.construction.constructionfirm.service;

import com.construction.constructionfirm.entity.DrzaveEntity;
import com.construction.constructionfirm.repos.DrzaveRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrzaveService {

    @Autowired
    private DrzaveRepo drzaveRepo;

    public List<DrzaveEntity> getAllDrzave() {
        List<DrzaveEntity> drzave = drzaveRepo.findAll();
        return drzave;
    }

    public DrzaveEntity saveDrzave(DrzaveEntity drzaveEntity) {
        return drzaveRepo.save(drzaveEntity);
    }
}