package com.pra.rest.repository;

import java.util.Collection;
import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.pra.rest.domain.BankAccount;

@Repository
public class BankAccountRepositoryImpl implements BankAccountRepository {

    private final HashMap<Long, BankAccount> accounts = new HashMap<>();
    
    @Override
    public BankAccount save(BankAccount account) {
        accounts.put(account.getId(), account);
        return accounts.get(account.getId());
    }

    @Override
    public Collection<BankAccount> findAll() {
       return accounts.values();
    }
}
