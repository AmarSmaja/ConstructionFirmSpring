package com.construction.constructionfirm.repos;

import com.construction.constructionfirm.entity.JobZahtjeviEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobZahtjeviRepo extends JpaRepository<JobZahtjeviEntity, Integer> {

}