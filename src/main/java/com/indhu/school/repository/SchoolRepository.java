package com.indhu.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.indhu.school.entity.SchoolEntity;

@Repository
public interface SchoolRepository extends JpaRepository<SchoolEntity, Integer> {
  //  boolean existsByEmail(String emailId);
    boolean existsByNameOrEmail(String name,String emailId);


}
