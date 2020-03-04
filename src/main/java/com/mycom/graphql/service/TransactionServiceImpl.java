package com.mycom.graphql.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycom.graphql.dao.entity.Transaction;
import com.mycom.graphql.dao.repository.TransactionRepository;

@Service
public class TransactionServiceImpl implements TransactionService{

	@Autowired
	private TransactionRepository transactionRepository;
	
	/*public List<Transaction> getTransactions(Map<String, String> params) {
		List<TransactionDTO> transactions = transactionMapper.getTransactions(params);
		return transactions;
	}
	
	public List<Transaction> getTransactionsByAccountNo(Map<String, String> params){
		List<TransactionDTO> transactions = transactionMapper.getTransactionsByAccountNo(params);
		return transactions;
	}
	
	public List<Transaction> getTransactionsByDesc(Map<String, String> params) {
		List<TransactionDTO> transactions = transactionMapper.getTransactionsByDesc(params);
		return transactions;
	}
	
	public List<Transaction> getTransactionsByCustomerId(Map<String, String> params) {
		List<TransactionDTO> transactions = transactionMapper.getTransactionsByCustomerId(params);
		return transactions;
	}*/
	
	public void saveTransaction(Long accountNo, Long amount, String description, String trxDate, String trxTime, Long customerId) {

		//transaction.setTrxTimestamp(transaction.getTrxDate().replace("-", "") + transaction.getTrxTime().replace(":", ""));
		//double d = Double.parseDouble(transaction.getAmount())*100;
		//int amtCents = (int)d;
		//transaction.setAmount(amtCents);
		Transaction trans = new Transaction();
		trans.setAccountNo(accountNo);
		trans.setAmount(amount);
		trans.setDescription(description);
		trans.setTrxDate(trxDate);
		trans.setTrxTime(trxTime);
		trans.setCustomerId(customerId);
		transactionRepository.save(trans);
	}
}
