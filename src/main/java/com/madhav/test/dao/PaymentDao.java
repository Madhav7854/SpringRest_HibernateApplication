package com.madhav.test.dao;

import java.util.List;

import com.madhav.test.model.Payment;

public interface PaymentDao {
	public String payNow(Payment payment);

	public List<Payment> getTransactionInfo(String vendor);
}
