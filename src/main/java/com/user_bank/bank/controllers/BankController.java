package com.user_bank.bank.controllers;

import com.user_bank.bank.dao.model.Bank;
import com.user_bank.bank.dao.model.User;
import com.user_bank.bank.services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BankController {
    @Autowired
    private BankService bankService;
    @GetMapping(value = "/user")
    public @ResponseBody List<User> getUser()
    {
        return bankService.listUser();
    }
    @GetMapping(value = "/bank")
    public @ResponseBody List<Bank> getBank()
    {
        return bankService.listBank();
    }
    @PostMapping(value = "/user")
    public @ResponseBody String postUser(@RequestBody User user)
    {
        return  bankService.postUser(user);

    }
    @PutMapping(value = "/user")
    public @ResponseBody String putUser(@RequestBody User user)
    {
        return  bankService.putUser(user);
    }
    @PostMapping(value = "/bank")
    public  @ResponseBody String postBank(@RequestBody Bank bank)
    {
        return  bankService.postBank(bank);

    }
    @PutMapping(value = "/bank")
    public  @ResponseBody String putBank(@RequestBody Bank bank)
    {
        return  bankService.putBank(bank);
    }
    @DeleteMapping(value = "/user/{id}")
    public  @ResponseBody String deleteUser(@PathVariable(value = "id") long id)
    {
        return  bankService.deleteUser(id);
    }
    @DeleteMapping(value = "/bank/{id}")
    public  @ResponseBody String deleteBank(@PathVariable (value = "id") long id)
    {
        return  bankService.deleteBank(id);
    }
}
