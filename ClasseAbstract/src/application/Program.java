package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Account acc2 = new SavingAccount(1002, "Maria", 1500.00, 0.01);

		List<Account> list = new ArrayList<>();

		list.add(new BusinessAccount(1001, "Alex", 1000.00, 500.00));
		list.add(acc2);

		Double sum = 0.0;
		for (Account c : list) {

			// somar todos os saldos(balace)
			sum += c.getBalance();

		}

		System.out.printf("Total balance: %.2f%n", sum);
		for (Account c : list) {

			// somar todos os saldos(balace)
			c.deposit(10.0);
			
			System.out.println(c.getHolder() + " - " + c.getBalance());
		}

	}

}
