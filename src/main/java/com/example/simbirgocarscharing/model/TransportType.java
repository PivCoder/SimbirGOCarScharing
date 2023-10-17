package com.example.simbirgocarscharing.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity(name = "transport_type")
@Table(schema = "project", name = "transport_type")
public class TransportType extends AbstractEntity {
    @Column
    private String typeOfTransport;

    @JsonBackReference
    @OneToMany(mappedBy = "transport_type", fetch = FetchType.LAZY)
    private List<Model> modelList;

    public TransportType() {

    }

    public TransportType(String typeOfTransport) {
        this.typeOfTransport = typeOfTransport;
    }

    public TransportType(String typeOfTransport, List<Model> modelList) {
        this.typeOfTransport = typeOfTransport;
        this.modelList = modelList;
    }

    public String getTypeOfTransport() {
        return typeOfTransport;
    }

    public void setTypeOfTransport(String typeOfTransport) {
        this.typeOfTransport = typeOfTransport;
    }

    public List<Model> getModelList() {
        return modelList;
    }

    public void setModelList(List<Model> modelList) {
        this.modelList = modelList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransportType transportType)) return false;
        return Objects.equals(getId(), transportType.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "TransportType{" +
                "typeOfTransport='" + typeOfTransport + '\'' +
                '}';
    }
}
