package com.SpringAOP;

public class Account implements Bank {
	
	public void withdraw() {
		System.out.println("Withdraw Logic");
	}
	public void deposit() {
		System.out.println("Deposit Logic");
	}
}
