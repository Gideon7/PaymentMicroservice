/**
 * 
 */
package com.paymentservice.application.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paymentservice.application.entity.Payment;
import com.paymentservice.application.service.PaymentService;

/**
 * @author Giddytech
 *
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	PaymentService paymentService;
	
	private PaymentController(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	@PostMapping("/doPayment")
	public Payment doPayment(@RequestBody Payment payment) {
		return paymentService.addPayment(payment);
	}
}
