package com.construction.constructionfirm.service;

import com.construction.constructionfirm.entity.JobZahtjeviEntity;
import com.construction.constructionfirm.repos.JobZahtjeviRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobZahtjeviService {

    @Autowired
    private JobZahtjeviRepo jobZahtjeviRepo;

    public List<JobZahtjeviEntity> getAllJobZahtjevi() {
        List<JobZahtjeviEntity> jobZahtjeviEntities = jobZahtjeviRepo.findAll();
        return jobZahtjeviEntities;
    }

    public JobZahtjeviEntity saveJobZahtjev(JobZahtjeviEntity jobZahtjeviEntity) {
        return jobZahtjeviRepo.save(jobZahtjeviEntity);
    }
}
