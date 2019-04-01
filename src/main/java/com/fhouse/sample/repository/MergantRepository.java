package com.fhouse.sample.repository;

import com.fhouse.sample.model.Agent;
import com.fhouse.sample.model.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MergantRepository extends JpaRepository<Merchant, Long> {

}