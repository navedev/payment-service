package com.wipro.payment.domain;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "payment")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private Integer userid;

	@NotBlank
	private String username;

	@NotBlank
	@Email
	private String email;

	@NotBlank
	@Size(max = 10)
	private String phone;

	@NotBlank
	@Size(max = 16)
	private Long cardno;

	@NotBlank
	private Integer cvv;

	@NotBlank
	private String expirydate;

	@NotBlank
	@Digits(integer = 6, fraction = 2)
	private BigDecimal amount;

	@Column(name = "created_on")
	private ZonedDateTime creationDateTime = ZonedDateTime.now();
}
