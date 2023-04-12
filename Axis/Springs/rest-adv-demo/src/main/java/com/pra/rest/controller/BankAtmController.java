package com.pra.rest.controller;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pra.rest.domain.BankAccount;
import com.pra.rest.dto.AppResponse;
import com.pra.rest.dto.BankAccountDto;
import com.pra.rest.service.BankAccountService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RequestMapping(value = "/atm")
@RestController
public class BankAtmController {
 
    private final BankAccountService service;

    @PostMapping(value = "/")
    public ResponseEntity<AppResponse<BankAccountDto>> create(@RequestBody BankAccountDto requestDto) {

        BankAccount account = new BankAccount();
        account.setBalance(requestDto.getBalance());
        account.setId(requestDto.getId());
        account.setOnwer(requestDto.getOwner());
        account.setLastModified(LocalDate.now());

        service.createNewAccount(account);


        BankAccountDto responseDto = new BankAccountDto(account.getId(), account.getOnwer(), account.getBalance());

        AppResponse<BankAccountDto> response = AppResponse.<BankAccountDto>builder()
                                                    .sts("success")
                                                    .msg("account created successfully")
                                                    .bd(responseDto)
                                                    .build();

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
