package com.example.simbirgocarscharing.mapper;

import com.example.simbirgocarscharing.dto.AccountAdministratorDto;
import com.example.simbirgocarscharing.dto.AccountDto;
import com.example.simbirgocarscharing.model.Account;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = TransportMapper.class)
public abstract class AccountMapper {
    public abstract AccountDto toAccountDto(Account account);

    public abstract AccountAdministratorDto toAccountAdministratorDto(Account account);

    public abstract Account toAccount(AccountDto accountDto);

    public abstract Account toAccount(AccountAdministratorDto accountAdministratorDto);
}
