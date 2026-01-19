package model.system;

import java.util.Locale;
import java.util.Scanner;

import model.Exception.AccountException;
import model.entities.Account;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		try {
			System.out.println("Holder");
			String holder = sc.nextLine();
			System.out.println("Number Account");
			int number = sc.nextInt();
			System.out.println("Balance");
			double balance = sc.nextDouble();
			System.out.println("Withdraw Limit");
			double withdrawLimit = sc.nextDouble();
			Account account = new Account(number, holder, balance, withdrawLimit);
			System.out.println(account);
			System.out.print("Enter amount for withdraw :");
			double withdraw = sc.nextDouble();
			account.withdraw(withdraw);
			System.out.print("New balance : ");
			System.out.println(account.getBalance());
		}
		catch(AccountException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
	}

}
