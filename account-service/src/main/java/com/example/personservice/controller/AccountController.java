package com.example.personservice.controller;

import com.example.personservice.model.Account;
import com.example.personservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/account")
    public String addAccount(@RequestBody Account account) {
        return accountService.addAccount(account);
    }

    @GetMapping("/account/account{id}")
    public Account getAccount(@PathVariable int id) {
        return accountService.getAccount(id);
    }

    @GetMapping("/accounts/account")
    public List<Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    @PutMapping("/accounts/account")
    public String updateAccount(@RequestBody Account account) {
        return accountService.updateAccount(account);
    }

    @DeleteMapping("/accounts/account")
    public String deleteAccount(@RequestBody Account account) {
        return accountService.deleteAccount(account);
    }

}
