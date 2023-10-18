package com.example.simbirgocarscharing.service.api;

import com.example.simbirgocarscharing.model.TransportType;

import java.util.List;
import java.util.Optional;

public interface TransportTypeService {
    TransportType addTransportType(TransportType transportType);
    void deleteTransportType(long id);
    Optional<TransportType> getTransportTypeById(long id);
    TransportType editTransportType(TransportType transportType);
    List<TransportType> getAllTransportTypes();
}
