package com.example.simbirgocarscharing.mapper;

import com.example.simbirgocarscharing.dto.ModelDto;
import com.example.simbirgocarscharing.model.Model;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = TransportTypeMapper.class)
public abstract class ModelMapper {
    public abstract ModelDto toModelDto(Model model);

    public abstract Model toModel(ModelDto modelDto);
}
