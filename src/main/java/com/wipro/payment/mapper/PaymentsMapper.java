package com.wipro.payment.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.wipro.payment.domain.Payment;
import com.wipro.payment.model.PaymentDto;

@Mapper(componentModel = "spring")
public interface PaymentsMapper {

	@Mapping(target = "creationDateTime", ignore = true)
	@Mapping(target = "id", ignore = true)
	Payment mapPayment(PaymentDto paymentDto);

}
