package com.rocktech.controller;

import com.rocktech.model.Report1;
import com.rocktech.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("report1")
public class Report1Controller {

    @Autowired
    private ReportService<Report1> reportService;

    @PostMapping("/create")
    public ResponseEntity<Report1> createReport(@RequestBody Report1 report1) {
        return ResponseEntity.ok(reportService.insert(report1));
    }

    @GetMapping("/all")
    public List<Report1> all() {
        return reportService.getAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<Report1> get (@PathVariable int id) {
        return ResponseEntity.ok(reportService.get(id));
    }
}
