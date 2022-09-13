package com.construction.constructionfirm.service;

import com.construction.constructionfirm.entity.ZahtjevEntity;
import com.construction.constructionfirm.repos.ZahtjevRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZahtjevService {

    @Autowired
    private ZahtjevRepo zahtjevRepo;

    public List<ZahtjevEntity> getAllZahtjev() {
        List<ZahtjevEntity> zahtjevi = zahtjevRepo.findAll();
        return zahtjevi;
    }

    public ZahtjevEntity saveZahtjev(ZahtjevEntity zahtjevEntity) {
        return zahtjevRepo.save(zahtjevEntity);
    }
}
