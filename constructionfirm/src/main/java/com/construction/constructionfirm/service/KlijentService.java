package com.construction.constructionfirm.service;

import com.construction.constructionfirm.entity.DrzaveEntity;
import com.construction.constructionfirm.entity.KlijentEntity;
import com.construction.constructionfirm.repos.KlijentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KlijentService {

    @Autowired
    private KlijentRepo klijentRepo;

    public List<KlijentEntity> getAllKlijenti() {
        List<KlijentEntity> klijenti = klijentRepo.findAll();
        return klijenti;
    }

    public KlijentEntity saveKlijent(KlijentEntity klijentEntity) {
        return klijentRepo.save(klijentEntity);
    }
}