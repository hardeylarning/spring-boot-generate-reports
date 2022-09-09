package com.rocktech.controller;

import com.rocktech.model.Report1;
import com.rocktech.model.TempTest;
import com.rocktech.service.TempTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("temps")
public class TempTestController {

    @Autowired
    private TempTestService<TempTest> testService;

    @GetMapping("/all")
    public ResponseEntity<List<TempTest>> all() {
        return ResponseEntity.ok(testService.getAll());
    }

    @GetMapping("/{id}/report1")
    public List<Report1> allReport1(@PathVariable int id) {
        TempTest tempTest = testService.get(id);
        return List.copyOf(tempTest.getReport1());
    }
}
