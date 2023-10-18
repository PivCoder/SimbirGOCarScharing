package com.example.simbirgocarscharing.service.api;

import com.example.simbirgocarscharing.model.Model;

import java.util.List;
import java.util.Optional;

public interface ModelService {
    Model addModel(Model model);
    void deleteModel(long id);
    Optional<Model> getModelById(long id);
    Model editModel(Model model);
    List<Model> getAllModels();
}
