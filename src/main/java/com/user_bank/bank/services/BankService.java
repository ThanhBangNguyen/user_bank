package com.user_bank.bank.services;

import com.user_bank.bank.dao.model.Bank;
import com.user_bank.bank.dao.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

//
public interface BankService {
    List<Bank> listBank();
    List<User> listUser();

    String postUser(User user);
    String putUser(User user);

    String postBank(Bank bank);
    String putBank(Bank bank);


    String deleteUser(long id);
    String deleteBank(long id);
}
