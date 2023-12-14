package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {


		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bcc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		

		//UTILIZANDO O UPCASTING - CONVERTENDO SUBCLASSE PARA SUPERCLASSE
		
		Account acc1 = bcc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingAccount(1004, "Claudinha", 0.0, 0.01);
		
		
		//UTILIZANDO O DOWNCASTING - CONVERTENDO DA SUPERCLASSE PARA SUBCLASSE
		
		//BusinessAccount acc4 = acc2; -> nesse caso nao é possivel porque BusinessAccount nao sabe do SavingAccount 
		
		// para funcionar ou testar se isso é possivel utizaremos o instanceof
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan");
			
		}
		
		if(acc3 instanceof SavingAccount) {
			SavingAccount acc5 = (SavingAccount)acc3;
			acc5.updateBalance(0.0);
			System.out.println("Update");
			
		}
		
		
		
	}

}
