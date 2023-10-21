package com.example.simbirgocarscharing.dto;

import com.example.simbirgocarscharing.model.enums.RentTypes;
import com.example.simbirgocarscharing.util.InputDataFormatUtil;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;

import java.util.List;

public class TransportAdministratorDto {
    private boolean canBeRated;
    private String color;
    private String description;
    private AccountDto arendatorDtoId;
    private List<AccountDto> HistoryAccountDtoList;

    @NotBlank
    @Pattern(regexp = InputDataFormatUtil.IDENTIFIER_RUS, message = "Некорректный формат номера (формат: X000XX00)")
    private String identifier;

    @NotNull
    private double latitude;

    @NotNull
    private double longitude;

    @NotNull
    private RentTypes rentType;

    @Positive
    private double minutePrice;

    @Positive
    private double dayPrice;

    @NotNull
    private ModelDto modelDtoId;

    @NotNull
    private AccountDto ownerDtoId;

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

    public ModelDto getModelDtoId() {
        return modelDtoId;
    }

    public void setModelDtoId(ModelDto modelDtoId) {
        this.modelDtoId = modelDtoId;
    }

    public AccountDto getOwnerDtoId() {
        return ownerDtoId;
    }

    public void setOwnerDtoId(AccountDto ownerDtoId) {
        this.ownerDtoId = ownerDtoId;
    }

    public AccountDto getArendatorDtoId() {
        return arendatorDtoId;
    }

    public void setArendatorDtoId(AccountDto arendatorDtoId) {
        this.arendatorDtoId = arendatorDtoId;
    }

    public List<AccountDto> getHistoryAccountDtoList() {
        return HistoryAccountDtoList;
    }

    public void setHistoryAccountDtoList(List<AccountDto> historyAccountDtoList) {
        HistoryAccountDtoList = historyAccountDtoList;
    }
}
