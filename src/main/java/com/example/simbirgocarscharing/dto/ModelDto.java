package com.example.simbirgocarscharing.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ModelDto {
    @NotBlank
    private String modelName;

    @NotNull
    private TransportTypeDto transportTypeDto;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public TransportTypeDto getTransportTypeDto() {
        return transportTypeDto;
    }

    public void setTransportTypeDto(TransportTypeDto transportTypeDto) {
        this.transportTypeDto = transportTypeDto;
    }
}
