package com.example.simbirgocarscharing.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.util.List;

public class AccountDto {
    private List<TransportDto> historyTransportDtoList;
    private List<TransportDto> ownerTransportDtoList;

    @NotBlank
    private String userName;

    @Positive
    private BigDecimal balance;

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
}
