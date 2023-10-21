package com.example.simbirgocarscharing.mapper;

import com.example.simbirgocarscharing.dto.TransportTypeDto;
import com.example.simbirgocarscharing.model.TransportType;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class TransportTypeMapper {
    public abstract TransportTypeDto toTransportTypeDto(TransportType transportType);

    public abstract TransportType toTransportType(TransportTypeDto transportTypeDto);
}
