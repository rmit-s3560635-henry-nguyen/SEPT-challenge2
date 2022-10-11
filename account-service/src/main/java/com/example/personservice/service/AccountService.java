package com.example.personservice.service;

import com.example.personservice.dao.AccountDao;
import com.example.personservice.model.Account;
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
