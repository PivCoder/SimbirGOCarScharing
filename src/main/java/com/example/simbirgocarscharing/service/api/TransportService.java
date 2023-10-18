package com.example.simbirgocarscharing.service.api;

import com.example.simbirgocarscharing.model.Transport;

import java.util.List;
import java.util.Optional;

public interface TransportService {
    Transport addTransport(Transport transport);
    void deleteTransport(long id);
    Optional<Transport> getTransportById(long id);
    Transport editTransport(Transport transport);
    List<Transport> getAllTransports();
}
