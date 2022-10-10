package com.example.accountservice.service;

import com.example.accountservice.dao.AccountDao;
import com.example.accountservice.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class AccountService {
    @Autowired
    private AccountDao dao;

    private Date date = new Date();

    public String addAccount(Account account) {
        account.setDate(date.toString());
        dao.save(account);
        return "Account added successfully";
    }

    public Account getAccount(int id) {
        return dao.findById(id).get();
    }

    public List<Account> getAllAccounts() {
        return dao.findAll();
    }

    public String updateAccount(Account account) {
        dao.save(account);
        return "Account updated successfully";
    }

    public String deleteAccount(Account account) {
        dao.delete(account);
        return "Account deleted successfully";
    }
}
