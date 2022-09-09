package com.rocktech.service;

import com.rocktech.model.Report1;
import com.rocktech.repository.Report1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Report1ServiceImpl implements ReportService<Report1>{

    @Autowired
    private Report1Repository repository;
    @Override
    public Report1 insert(Report1 report1) {
        return repository.save(report1);
    }

    @Override
    public List<Report1> getAll() {
        return repository.findAll();
    }

    @Override
    public Report1 get(int id) {
        Optional<Report1> report = repository.findById(id);
        report.orElseThrow(() -> new RuntimeException("No Report found for: "+id));

        return report.get();
    }
}
