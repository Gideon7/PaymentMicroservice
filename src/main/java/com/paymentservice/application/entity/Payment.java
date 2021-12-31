/**
 * 
 */
package com.paymentservice.application.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Giddytech
 *
 */
@Entity
@Table(name= "PAYMENT_TB")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
	@Id
	@GeneratedValue
	private int paymentID;
	private String paymentStatus;
	private String transactionId;
	private int orderID;
	private int amount;
}
