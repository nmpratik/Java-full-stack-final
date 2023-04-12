package com.pra.rest.repository;

import com.pra.rest.domain.BankAccount;

public interface BankAccountRepository {
    
    BankAccount save(BankAccount account);
}
