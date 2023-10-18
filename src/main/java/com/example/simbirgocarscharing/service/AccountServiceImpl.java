package com.example.simbirgocarscharing.service;

import com.example.simbirgocarscharing.model.Account;
import com.example.simbirgocarscharing.repository.AccountRepository;
import com.example.simbirgocarscharing.service.api.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account addAccount(Account account) {
        return null;
    }

    @Override
    public void deleteAccount(long id) {

    }

    @Override
    public Optional<Account> getAccountById(long id) {
        return Optional.empty();
    }

    @Override
    public Account editAccount(Account account) {
        return null;
    }

    @Override
    public List<Account> getAllAccounts() {
        return null;
    }
}
