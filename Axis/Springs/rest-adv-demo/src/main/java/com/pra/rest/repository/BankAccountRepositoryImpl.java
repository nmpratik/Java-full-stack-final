package com.pra.rest.repository;

import org.springframework.stereotype.Repository;

import com.pra.rest.domain.BankAccount;

@Repository
public class BankAccountRepositoryImpl implements BankAccountRepository{
    @Override
    public BankAccount save(BankAccount account) {
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }
}