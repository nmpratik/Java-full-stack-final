package com.pra.rest.service;

import java.util.Collection;

import com.pra.rest.dto.BankAccountDto;

public interface BankAccountService {
 
    Integer createNewAccount(BankAccountDto account);

    Collection<BankAccountDto> listAllAccounts();
}



