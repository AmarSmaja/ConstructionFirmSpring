package com.construction.constructionfirm.repos;

import com.construction.constructionfirm.entity.DrzaveEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrzaveRepo extends JpaRepository<DrzaveEntity, Integer> {

}