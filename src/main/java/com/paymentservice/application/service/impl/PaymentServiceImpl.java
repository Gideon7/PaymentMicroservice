/**
 * 
 */
package com.paymentservice.application.service.impl;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paymentservice.application.entity.Payment;
import com.paymentservice.application.repository.PaymentRepository;
import com.paymentservice.application.service.PaymentService;

/**
 * @author Giddytech
 *
 */
@Service
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	PaymentRepository paymentRepository;

	@Override
	public Payment addPayment(Payment payment) {
		payment.setPaymentStatus(this.paymentProcessing());
		payment.setTransactionId(UUID.randomUUID().toString());
		return paymentRepository.save(payment);
	}
	
	private String paymentProcessing() {
		return new Random().nextBoolean() ? "success" : "false";
	}

}
