package com.pra.rest.service;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.pra.rest.dto.BankAccountDto;
import com.pra.rest.repository.BankAccountRepository;
import com.pra.rest.util.DmDtConverter;

import lombok.AllArgsConstructor;

@AllArgsConstructor // to enable constructor injection
@Service
public class BankAccountServiceImpl implements BankAccountService{

    private final BankAccountRepository repository;
    private final DmDtConverter converter;

    @Override
    public Integer createNewAccount(BankAccountDto dto) {
        repository.save(converter.toDomain(dto));
        return 1;
    }

    @Override
    public Collection<BankAccountDto> listAllAccounts() {

        return repository.findAll()
                            .stream()
                            // .map(account -> converter.toDto(account))
                           .map(converter::toDto)
                           .collect(Collectors.toList());
    }
}
