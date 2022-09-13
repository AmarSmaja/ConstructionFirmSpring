package com.construction.constructionfirm.repos;

import com.construction.constructionfirm.entity.HQEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HQRepo extends JpaRepository<HQEntity, Integer> {

}