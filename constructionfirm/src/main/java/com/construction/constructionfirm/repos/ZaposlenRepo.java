package com.construction.constructionfirm.repos;

import com.construction.constructionfirm.entity.ZaposlenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZaposlenRepo extends JpaRepository<ZaposlenEntity, Integer> {

}