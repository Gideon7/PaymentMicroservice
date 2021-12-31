/**
 * 
 */
package com.paymentservice.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paymentservice.application.entity.Payment;

/**
 * @author Giddytech
 *
 */
@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}
