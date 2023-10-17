package com.example.simbirgocarscharing.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

@Entity(name = "account")
@Table(schema = "project", name = "account")
public class Account extends AbstractEntity {
    @Column
    private String userName;

    @Column
    private String password;

    @Column
    private BigDecimal balance;

    @Column
    private boolean isAdmin;

    @JsonBackReference
    @OneToMany(mappedBy = "account", fetch = FetchType.LAZY)
    private List<Transport> transportList;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "account_transport",
            joinColumns = { @JoinColumn(name = "account_id") },
            inverseJoinColumns = { @JoinColumn(name = "transport_id") })
    List<Transport> historyTransportList;

    public Account() {

    }

    public Account(String userName,
                   String password,
                   BigDecimal balance,
                   boolean isAdmin) {
        this.userName = userName;
        this.password = password;
        this.balance = balance;
        this.isAdmin = isAdmin;
    }

    public Account(String userName,
                   String password,
                   BigDecimal balance,
                   boolean isAdmin,
                   List<Transport> transportList) {
        this.userName = userName;
        this.password = password;
        this.balance = balance;
        this.isAdmin = isAdmin;
        this.transportList = transportList;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public List<Transport> getTransportList() {
        return transportList;
    }

    public void setTransportList(List<Transport> transportList) {
        this.transportList = transportList;
    }

    public List<Transport> getHistoryTransportList() {
        return historyTransportList;
    }

    public void setHistoryTransportList(List<Transport> historyTransportList) {
        this.historyTransportList = historyTransportList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account account)) return false;
        return Objects.equals(getId(), account.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Account{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", isAdmin=" + isAdmin +
                '}';
    }
}
