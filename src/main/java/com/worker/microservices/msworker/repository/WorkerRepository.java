package com.worker.microservices.msworker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.worker.microservices.msworker.entity.WorkerEntity;

public interface WorkerRepository extends JpaRepository<WorkerEntity, Long> {
    
}
