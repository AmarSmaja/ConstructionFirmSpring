package com.construction.constructionfirm.service;

import com.construction.constructionfirm.entity.DrzaveEntity;
import com.construction.constructionfirm.repos.DrzaveRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DrzaveService{

    @Autowired
    private DrzaveRepo drzaveRepo;

    public List<DrzaveEntity> getAllDrzave() {
        List<DrzaveEntity> drzave = drzaveRepo.findAll();
        return drzave;
    }

    public DrzaveEntity saveDrzave(DrzaveEntity drzaveEntity) {
        return drzaveRepo.save(drzaveEntity);
    }
    public int updateDrzava(DrzaveEntity drzaveEntity) {
        drzaveRepo.save(drzaveEntity);
        return 2;
    }

    public String deleteRow(Integer drzava_id) {
        drzaveRepo.deleteById(drzava_id);
        return "Success";
    }

    public DrzaveEntity getDrzavaById(Integer drzava_id) {
        Optional<DrzaveEntity> optional = drzaveRepo.findById(drzava_id);
        DrzaveEntity drzaveEntity = optional.get();
        return drzaveEntity;
    }
}