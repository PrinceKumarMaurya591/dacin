package com.dacinc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dacinc.controller.PaymentController;
import com.dacinc.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}