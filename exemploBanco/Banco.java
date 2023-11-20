package exemploBanco;

import java.util.Locale;
import java.util.Scanner;

import exemploBancoCodigo.Account;

public class Banco {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
				
		System.out.println("Enter account holder: ");
		String holder = sc.next();
						
		System.out.println("Is there a initial deposit (y/n)?");
		String op = sc.next();
		double deposit = 0;
		
		switch (op) {
		case "y", "Y":
			 System.out.println("Enter initial deposit value: ");
			 deposit = sc.nextDouble();
			 break;
		
		case "n","N":
			break;
		}

		Account ac = new Account(number, holder, deposit);
		
		System.out.println("");
		System.out.println("------------------------------------------------------");
		System.out.println("Account data: " + ac.tostring());
		System.out.println("------------------------------------------------------");
		System.out.println("");
		
		System.out.println("Enter deposit value: ");
		double dep = sc.nextDouble();
		ac.deposit(dep);
		
		System.out.println("");
		System.out.println("------------------------------------------------------");
		System.out.println("Updated account data: " + ac.tostring());
		System.out.println("------------------------------------------------------");
		System.out.println("");
		
		System.out.println("Enter withdraw value: ");
		double withdraw = sc.nextDouble();
		ac.withdraw(withdraw);
		
		System.out.println("");
		System.out.println("------------------------------------------------------");
		System.out.println("Updated account data: " + ac.tostring());
		System.out.println("------------------------------------------------------");
		
	sc.close();
	}

}
