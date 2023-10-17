package com.example.simbirgocarscharing.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity(name = "model")
@Table(schema = "project", name = "model")
public class Model extends AbstractEntity{
    @Column
    private String modelName;

    @JsonManagedReference
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "transport_type_id")
    private TransportType transportType;

    @JsonBackReference
    @OneToMany(mappedBy = "modelId", fetch = FetchType.LAZY)
    private List<Transport> transportList;

    public Model() {

    }

    public Model(String modelName, TransportType transportType) {
        this.modelName = modelName;
        this.transportType = transportType;
    }

    public Model(String modelName, TransportType transportType, List<Transport> transportList) {
        this.modelName = modelName;
        this.transportType = transportType;
        this.transportList = transportList;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }

    public List<Transport> getTransportList() {
        return transportList;
    }

    public void setTransportList(List<Transport> transportList) {
        this.transportList = transportList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Model model)) return false;
        return Objects.equals(getId(), model.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Model{" +
                "modelName='" + modelName + '\'' +
                '}';
    }
}
