package com.pra.rest.repository;

import java.util.Collection;

import com.pra.rest.domain.BankAccount;

public interface BankAccountRepository {
    
    BankAccount save(BankAccount account);

    Collection<BankAccount> findAll();
}

