package com.construction.constructionfirm.service;

import com.construction.constructionfirm.entity.ZaposlenEntity;
import com.construction.constructionfirm.repos.ZaposlenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZaposlenService {

    @Autowired
    private ZaposlenRepo zaposlenRepo;

    public List<ZaposlenEntity> getAllZaposleni() {
        List<ZaposlenEntity> zaposleni = zaposlenRepo.findAll();
        return zaposleni;
    }

    public ZaposlenEntity saveZaposlen(ZaposlenEntity zaposlenEntity) {
        return zaposlenRepo.save(zaposlenEntity);
    }
}