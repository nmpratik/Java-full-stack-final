package com.pra.rest.util;

import org.springframework.stereotype.Component;

import com.pra.rest.domain.BankAccount;
import com.pra.rest.dto.BankAccountDto;

@Component
public class DmDtConverter {
    
    public BankAccount toDomain(BankAccountDto dto) {
        return new BankAccount();
    }

    public BankAccountDto toDto(BankAccount account) {
        return new BankAccountDto();
    }
}
