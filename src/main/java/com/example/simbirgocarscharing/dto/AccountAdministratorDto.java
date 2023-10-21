package com.example.simbirgocarscharing.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.util.List;

public class AccountAdministratorDto {
    private boolean isAdmin;
    private List<TransportDto> historyTransportDtoList;
    private List<TransportDto> ownerTransportDtoList;
    private List<TransportDto> arendatorTransportList;

    @NotBlank
    private String userName;

    @Positive
    private BigDecimal balance;

    @NotBlank
    @Size(min = 8, max = 20)
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public List<TransportDto> getHistoryTransportDtoList() {
        return historyTransportDtoList;
    }

    public void setHistoryTransportDtoList(List<TransportDto> historyTransportDtoList) {
        this.historyTransportDtoList = historyTransportDtoList;
    }

    public List<TransportDto> getOwnerTransportDtoList() {
        return ownerTransportDtoList;
    }

    public void setOwnerTransportDtoList(List<TransportDto> ownerTransportDtoList) {
        this.ownerTransportDtoList = ownerTransportDtoList;
    }

    public List<TransportDto> getArendatorTransportList() {
        return arendatorTransportList;
    }

    public void setArendatorTransportList(List<TransportDto> arendatorTransportList) {
        this.arendatorTransportList = arendatorTransportList;
    }
}
