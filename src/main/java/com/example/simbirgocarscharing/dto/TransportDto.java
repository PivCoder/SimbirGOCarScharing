package com.example.simbirgocarscharing.dto;

import com.example.simbirgocarscharing.model.enums.RentTypes;
import com.example.simbirgocarscharing.util.InputDataFormatUtil;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;

public class TransportDto {
    private boolean canBeRated;
    private String color;
    private String description;

    @NotBlank
    @Pattern(regexp = InputDataFormatUtil.IDENTIFIER_RUS, message = "Некорректный формат номера (формат: X000XX00)")
    private String identifier;

    @NotNull
    private double latitude;

    @NotNull
    private double longitude;

    @Positive
    private double minutePrice;

    @Positive
    private double dayPrice;

    @NotNull
    private RentTypes rentType;

    @NotNull
    private ModelDto modelId;

    @NotNull
    private AccountDto ownerId;

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

    public RentTypes getRentType() {
        return rentType;
    }

    public void setRentType(RentTypes rentType) {
        this.rentType = rentType;
    }

    public ModelDto getModelId() {
        return modelId;
    }

    public void setModelId(ModelDto modelId) {
        this.modelId = modelId;
    }

    public AccountDto getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(AccountDto ownerId) {
        this.ownerId = ownerId;
    }
}
