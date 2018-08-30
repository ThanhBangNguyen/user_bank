package com.user_bank.bank.dao.repositories;

import com.user_bank.bank.dao.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends JpaRepository <Bank ,Long> {
}
