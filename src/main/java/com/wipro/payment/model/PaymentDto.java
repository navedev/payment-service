package com.wipro.payment.model;

import java.math.BigDecimal;
import java.math.BigInteger;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDto {

	private Integer userid;

	private String username;

	@Email
	private String email;

	@Positive
	private BigInteger phone;

	private Long cardno;

	private Integer cvv;

	private String expirydate;

	private BigDecimal amount;
}
