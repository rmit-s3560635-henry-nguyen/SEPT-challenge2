package com.example.personservice.dao;

import com.example.personservice.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountDao extends JpaRepository<Account, Integer> { }
