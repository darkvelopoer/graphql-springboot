package com.mycom.graphql.service;

import com.mycom.graphql.dao.entity.Transaction;

public interface TransactionService {
	public void saveTransaction(Long accountNo, Long amount, String description, String trxDate, String trxTime, Long customerId);
}
