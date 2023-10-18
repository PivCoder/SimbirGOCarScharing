package com.example.simbirgocarscharing.service.api;

import com.example.simbirgocarscharing.model.Account;

import java.util.List;
import java.util.Optional;

public interface AccountService {
    Account addAccount(Account account);
    void deleteAccount(long id);
    Optional<Account> getAccountById(long id);
    Account editAccount(Account account);
    List<Account> getAllAccounts();
}
