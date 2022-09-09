package com.rocktech.repository;

import com.rocktech.model.TempTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TempTestRepository extends JpaRepository<TempTest, Integer> {

}
