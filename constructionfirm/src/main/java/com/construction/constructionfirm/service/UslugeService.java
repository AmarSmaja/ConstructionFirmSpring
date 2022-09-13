package com.construction.constructionfirm.service;

import com.construction.constructionfirm.entity.UslugeEntity;
import com.construction.constructionfirm.repos.UslugeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UslugeService {

    @Autowired
    private UslugeRepo uslugeRepo;

    public List<UslugeEntity> getAllUsluge() {
        List<UslugeEntity> usluge = uslugeRepo.findAll();
        return usluge;
    }

    public UslugeEntity saveUsluge(UslugeEntity uslugeEntity) {
        return uslugeRepo.save(uslugeEntity);
    }
}