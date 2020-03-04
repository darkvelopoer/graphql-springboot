package com.mycom.graphql.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.mycom.graphql.dao.entity.Transaction;
import com.mycom.graphql.service.TransactionService;

@Component
public class TransactionMutation implements GraphQLMutationResolver{
    @Autowired
    private TransactionService transactionService;
    
/*    public void saveTransaction(final Long accountNo, final Long amount, final String description, final String trxDate, final String trxTime, final Long customerId) {
         this.transactionService.saveTransaction(accountNo, amount, description, trxDate, trxTime, customerId);
    }*/
    
    public Transaction saveTransaction(final Long accountNo, final String amount, final String description, final String trxDate, final String trxTime, final String customerId) {
    	System.out.println("saveTransaction>>>>>>>>>");
		Transaction trans = new Transaction();
		trans.setAccountNo(accountNo);
		trans.setAmount(100L);
		trans.setDescription(description);
		trans.setTrxDate(trxDate);
		trans.setTrxTime(trxTime);
		trans.setCustomerId(500L);
    	return trans;
    }
}
