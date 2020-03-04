package com.mycom.graphql.dao.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Entity
public class Transaction implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Column(name = "accountNo", nullable = false)
	private Long accountNo;
    
    @Column(name = "amount", nullable = false)
	private Long amount;
    
    @Column(name = "description")
	private String description;
    
    @Column(name = "trxDate")
	private String trxDate;
    
    @Column(name = "trxTime")
	private String trxTime;
    
    @Column(name = "customerId", nullable = false)
	private Long customerId;
}
