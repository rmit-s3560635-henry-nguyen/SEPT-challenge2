package com.example.accountservice.dao;

import com.example.accountservice.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountDao extends JpaRepository<Account, Integer> { }
