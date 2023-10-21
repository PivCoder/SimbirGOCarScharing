package com.example.simbirgocarscharing.model;

import com.example.simbirgocarscharing.model.enums.RentTypes;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity(name = "transport")
@Table(schema = "project", name = "transport")
public class Transport extends AbstractEntity {
    @Column
    private boolean canBeRated;

    @Column
    private String color;

    @Column
    private String identifier;

    @Column
    private String description;

    @Column
    private double latitude;

    @Column
    private double longitude;

    @Column
    private double minutePrice;

    @Column
    private double dayPrice;

    private RentTypes rentType;

    @JsonManagedReference
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "model_id")
    private Model modelId;

    @JsonManagedReference
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "owner_account_id")
    private Account ownerId;

    @JsonManagedReference
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "arendator_account_id")
    private Account arendatorId;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "historyTransportList")
    List<Account> HistoryAccountList;

    public Transport() {

    }

    public Transport(boolean canBeRated,
                     String color,
                     String identifier,
                     String description,
                     double latitude,
                     double longitude,
                     double minutePrice,
                     double dayPrice,
                     Model modelId,
                     Account ownerId,
                     RentTypes rentType) {
        this.canBeRated = canBeRated;
        this.color = color;
        this.identifier = identifier;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
        this.minutePrice = minutePrice;
        this.dayPrice = dayPrice;
        this.modelId = modelId;
        this.ownerId = ownerId;
        this.rentType = rentType;
    }

    public Transport(boolean canBeRated,
                     String color,
                     String identifier,
                     String description,
                     double latitude,
                     double longitude,
                     double minutePrice,
                     double dayPrice,
                     Model modelId,
                     Account ownerId,
                     Account arendatorId,
                     RentTypes rentType) {
        this.canBeRated = canBeRated;
        this.color = color;
        this.identifier = identifier;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
        this.minutePrice = minutePrice;
        this.dayPrice = dayPrice;
        this.modelId = modelId;
        this.ownerId = ownerId;
        this.arendatorId = arendatorId;
        this.rentType = rentType;
    }

    public boolean isCanBeRated() {
        return canBeRated;
    }

    public void setCanBeRated(boolean canBeRated) {
        this.canBeRated = canBeRated;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getMinutePrice() {
        return minutePrice;
    }

    public void setMinutePrice(double minutePrice) {
        this.minutePrice = minutePrice;
    }

    public double getDayPrice() {
        return dayPrice;
    }

    public void setDayPrice(double dayPrice) {
        this.dayPrice = dayPrice;
    }

    public Model getModelId() {
        return modelId;
    }

    public void setModelId(Model model) {
        this.modelId = model;
    }

    public Account getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Account ownerId) {
        this.ownerId = ownerId;
    }

    public Account getArendatorId() {
        return arendatorId;
    }

    public void setArendatorId(Account arendatorId) {
        this.arendatorId = arendatorId;
    }

    public List<Account> getHistoryAccountList() {
        return HistoryAccountList;
    }

    public void setHistoryAccountList(List<Account> historyAccountList) {
        HistoryAccountList = historyAccountList;
    }

    public RentTypes getRentType() {
        return rentType;
    }

    public void setRentType(RentTypes rentType) {
        this.rentType = rentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transport transport)) return false;
        return Objects.equals(getId(), transport.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Transport{" +
                "canBeRated=" + canBeRated +
                ", color='" + color + '\'' +
                ", identifier='" + identifier + '\'' +
                ", description='" + description + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", minutePrice=" + minutePrice +
                ", dayPrice=" + dayPrice +
                ", rentType=" + rentType +
                '}';
    }
}
