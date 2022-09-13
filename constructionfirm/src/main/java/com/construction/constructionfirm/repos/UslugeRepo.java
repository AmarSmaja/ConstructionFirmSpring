package com.construction.constructionfirm.repos;

import com.construction.constructionfirm.entity.UslugeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UslugeRepo extends JpaRepository<UslugeEntity, Integer> {

}