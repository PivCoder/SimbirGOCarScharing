package com.example.simbirgocarscharing.mapper;

import com.example.simbirgocarscharing.dto.TransportAdministratorDto;
import com.example.simbirgocarscharing.dto.TransportDto;
import com.example.simbirgocarscharing.model.Transport;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ModelMapper.class, AccountMapper.class})
public abstract class TransportMapper {
    public abstract TransportDto toTransportDto(Transport transport);

    public abstract TransportAdministratorDto toTransportAdministratorDto(Transport transport);

    public abstract Transport toTransport(TransportDto transportDto);

    public abstract Transport toTransport(TransportAdministratorDto transportAdministratorDto);
}
