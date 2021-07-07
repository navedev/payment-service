package com.wipro.payment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.wipro.payment.domain.Payment;
import com.wipro.payment.mapper.PaymentsMapper;
import com.wipro.payment.model.PaymentDto;
import com.wipro.payment.repository.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
	private PaymentsMapper paymentsMapper;

	@Autowired
	private PaymentRepository paymentRepository;

	public ResponseEntity<?> makePayment(PaymentDto paymentDto) {
		Payment payment = paymentsMapper.mapPayment(paymentDto);

		/**
		 * We should be integrating with Paypal, RazorPay or some other Payment system to
		 * Validate Payments - Out of Scope
		 */

		paymentRepository.save(payment);

		return ResponseEntity.ok("Payment successful for User ID: " + payment.getUserid());
	}

}
