package com.pra.rest.service;

import org.springframework.stereotype.Service;

import com.pra.rest.domain.BankAccount;
import com.pra.rest.repository.BankAccountRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor // to enable constructor injection
@Service
public class BankAccountServiceImpl implements BankAccountService{

    private final BankAccountRepository repository;

    @Override
    public Integer createNewAccount(BankAccount account) {
        repository.save(account);
        return 0;
    }
}
