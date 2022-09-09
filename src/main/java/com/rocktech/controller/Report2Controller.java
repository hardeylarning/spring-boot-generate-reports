package com.rocktech.controller;

import com.rocktech.model.Report1;
import com.rocktech.model.Report2;
import com.rocktech.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("report2")
public class Report2Controller {

    @Autowired
    private ReportService<Report2> reportService;

    @PostMapping("/create")
    public ResponseEntity<Report2> createReport(@RequestBody Report2 report2) {
        return ResponseEntity.ok(reportService.insert(report2));
    }

    @GetMapping("/all")
    public List<Report2> all() {
        return reportService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Report2> get (@PathVariable int id) {
        return ResponseEntity.ok(reportService.get(id));
    }
}
