package com.example.simbirgocarscharing.repository;

import com.example.simbirgocarscharing.model.TransportType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportTypeRepository extends JpaRepository<TransportType, Long> {
}
