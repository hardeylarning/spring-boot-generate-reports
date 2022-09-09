package com.rocktech.repository;

import com.rocktech.model.Report2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Report2Repository extends JpaRepository<Report2, Integer> {
}
