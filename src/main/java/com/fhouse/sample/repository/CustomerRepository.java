package com.fhouse.sample.repository;

import com.fhouse.sample.model.Agent;
import com.fhouse.sample.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}