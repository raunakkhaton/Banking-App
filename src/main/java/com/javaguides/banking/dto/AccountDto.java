package com.javaguides.banking.dto;

import lombok.AllArgsConstructor;

@lombok.Data
@AllArgsConstructor
public class AccountDto {
    private long id;
    private String accountHolderName;
    private double balance;
}
