package com.example.simbirgocarscharing.dto;

import jakarta.validation.constraints.NotBlank;

public class TransportTypeDto {
    @NotBlank
    private String typeOfTransport;

    public String getTypeOfTransport() {
        return typeOfTransport;
    }

    public void setTypeOfTransport(String typeOfTransport) {
        this.typeOfTransport = typeOfTransport;
    }
}
