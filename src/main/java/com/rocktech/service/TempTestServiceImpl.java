package com.rocktech.service;

import com.rocktech.model.TempTest;
import com.rocktech.repository.TempTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TempTestServiceImpl implements TempTestService<TempTest>{

    @Autowired
    private TempTestRepository repository;

    @Override
    public List<TempTest> getAll() {
        return repository.findAll();
    }

    @Override
    public TempTest get(int id) {
        Optional<TempTest> tempTest = repository.findById(id);
        tempTest.orElseThrow(() -> new RuntimeException("Not Found :"+ id));

        return tempTest.get();
    }
}
