package model.entities;

import model.Exception.AccountException;

public class Account {
	private Integer number;
	private String holder ;
	private Double balance;
	private Double withdrawLimite;
	
	public Account () {
		
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimite) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimite = withdrawLimite;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}


	public Double getWithdrawLimite() {
		return withdrawLimite;
	}

	public void deposit (Double amount) {
		
		balance += amount;
	}
	public void withdraw(Double amount) throws AccountException{
		if (this.balance == 0) {
			throw new  AccountException("Withdrawal cannot be made"
					+ " if balance is equal to 0");
		}
		if (amount > withdrawLimite) {
			throw new AccountException("The withdrawal amount cannot be greater than the account withdrawal limit");
		}
		balance -= amount;
	}
	public String toString() {
		return "Number : " + number + "\n" + "Holder : " + holder 
				+ "\n" + "Intitial balance : " + balance + "\n" +
				"Withdraw Limit : " + withdrawLimite;	
	}
}
