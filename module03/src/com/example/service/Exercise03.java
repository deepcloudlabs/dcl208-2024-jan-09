package com.example.service;

import java.util.List;

public class Exercise03 {
	public static void main(String[] args) {
			
	}
	
	public static void hesapİsletimUcretiAl(List<Account> accounts) {
		for (var account : accounts)
			account.withdraw(150.0);
	}
}

abstract class Account {
	private String iban;
	private double balance;
	
	public abstract void deposit(double amount);

	public abstract void withdraw(double amount);

	public double balance() {return this.balance;}
	public String iban() {return this.iban;}
}

class BasicAccount extends Account {

	@Override
	public void deposit(double amount) {
	}

	@Override
	public void withdraw(double amount) {
	}


}

class CheckingAccount extends Account {

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub

	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub

	}

}

class SavingsAccount extends Account {

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub

	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub

	}

}