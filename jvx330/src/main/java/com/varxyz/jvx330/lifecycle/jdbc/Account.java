package com.varxyz.jvx330.lifecycle.jdbc;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Account {

	private long aid;
	private Customer customer;
	private String accountNum;
	private char accType;
	private double balance;
	private double interestRate;
	private double overAmount;
	private Date regDate;
	
	public Account() {
		super();
	}
}
