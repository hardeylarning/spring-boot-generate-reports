package com.rocktech.service;

import com.rocktech.model.Report2;
import com.rocktech.repository.Report2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Report2ServiceImpl implements ReportService<Report2>{

    @Autowired
    private Report2Repository repository;

    @Override
    public Report2 insert(Report2 report1) {
        return repository.save(report1);
    }

    @Override
    public List<Report2> getAll() {
        return repository.findAll();
    }

    @Override
    public Report2 get(int id) {
        Optional<Report2> report = repository.findById(id);
        report.orElseThrow(() -> new RuntimeException("No Report found for: "+id));

        return report.get();
    }
}
