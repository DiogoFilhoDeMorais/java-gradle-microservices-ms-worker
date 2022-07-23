package com.worker.microservices.msworker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.worker.microservices.msworker.entity.WorkerEntity;
import com.worker.microservices.msworker.repository.WorkerRepository;

@RestController
@RequestMapping(value = "/ms-worker")
public class WorkerController {

    @Autowired
    private WorkerRepository repository;
    
    @GetMapping
    public ResponseEntity<List<WorkerEntity>> findAllWorkers() {
        List<WorkerEntity> list = repository.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<WorkerEntity> findWorkerById(@PathVariable Long id) {
        WorkerEntity worker = repository.findById(id).get();
        return ResponseEntity.ok(worker);
    }
}
