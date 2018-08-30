package com.user_bank.bank.services;

import com.user_bank.bank.dao.model.Bank;
import com.user_bank.bank.dao.model.User;
import com.user_bank.bank.dao.repositories.BankRepository;
import com.user_bank.bank.dao.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankServiceimpl implements BankService{
    @Autowired
    private BankRepository bankRepository;
    @Autowired
    private UserRepository userRepository;
    @Override


    public List<Bank> listBank() {
        return bankRepository.findAll();
    }

    @Override
    public List<User> listUser() {
        return userRepository.findAll();
    }

    @Override
    public String postUser(User user) {
        userRepository.save(user);
        return "OK";
}

    @Override
    public String putUser(User user) {
        userRepository.save(user);
        return "OK";
    }

    @Override
    public String postBank(Bank bank) {
        bankRepository.save(bank);
        return "OK";
    }

    @Override
    public String putBank(Bank bank) {
        bankRepository.save(bank);
        return "OK";
    }

    @Override
    public String deleteUser(long id) {
        userRepository.deleteById(id);
        return "OK";
    }

    @Override
    public String deleteBank(long id) {
        bankRepository.deleteById(id);
        return "OK";
    }
}
