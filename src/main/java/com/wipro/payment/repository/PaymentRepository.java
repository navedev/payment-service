package com.wipro.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.payment.domain.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long>{

}
