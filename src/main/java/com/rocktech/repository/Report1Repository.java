package com.rocktech.repository;

import com.rocktech.model.Report1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Report1Repository extends JpaRepository<Report1, Integer> {
}
