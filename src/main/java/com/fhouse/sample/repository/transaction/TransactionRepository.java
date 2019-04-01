package com.fhouse.sample.repository.transaction;

import com.fhouse.sample.model.Acquirer;
import com.fhouse.sample.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
