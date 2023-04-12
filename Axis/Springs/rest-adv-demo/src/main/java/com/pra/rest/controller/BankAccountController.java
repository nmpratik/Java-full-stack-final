package com.pra.rest.controller;

import org.springframework.web.bind.annotation.RestController;

import com.pra.rest.service.BankAccountService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class BankAccountController {

    private final BankAccountService service; // constructor injection had happened because lombk have created paramaterized constructor   

}
