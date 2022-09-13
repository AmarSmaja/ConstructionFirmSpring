package com.construction.constructionfirm.repos;

import com.construction.constructionfirm.entity.KlijentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KlijentRepo extends JpaRepository<KlijentEntity, Integer> {

    KlijentEntity findByUsername(String username);
}