// package S3_6;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class S3_6
{
	public static void main(String[] args)
	{
		;
	}
}
class Account
{
	String accountNumber;
	double balance;
	String password;

	public Account(String accountNumber, double balance, String password)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.password = password;
	}

	public boolean login(String inputPassword)
	{
		return this.password.equals(inputPassword);
	}

	public void deposit(double amount)
	{
		balance += amount;
		System.out.println("Deposit successful. New balance: " + balance);
	}

	public void withdraw(double amount)
	{
		if (amount > balance)
		{
			System.out.println("Insufficient balance!");
		}
		else
		{
			balance -= amount;
			System.out.println("Withdrawal successful. New balance: " + balance);
		}
	}
}

class ATM
{
	Account[] accounts;

	public ATM(Account[] accounts)
	{
		this.accounts = accounts;
	}

	public Account login(String accountNumber, String password)
	{
		for (Account acc : accounts)
		{
			if (acc.accountNumber.equals(accountNumber) && acc.login(password))
			{
				return acc;
			}
		}
		return null;
	}
}
class ATMTest
{
	public static void main(String[] args)
	{
		Account[] bankAccounts = {
				new Account("1001", 5000, "1234"),
				new Account("1002", 3000, "5678")
		};

		ATM atm = new ATM(bankAccounts);
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter account number: ");
		String accountNumber = scanner.nextLine();

		System.out.print("Enter password: ");
		String password = scanner.nextLine();

		Account user = atm.login(accountNumber, password);

		if (user != null)
		{
			while (true)
			{
				System.out.println("\n1. Deposit\n2. Withdraw\n3. Exit");
				System.out.print("Choose an option: ");
				int choice = scanner.nextInt();

				if (choice == 1)
				{
					System.out.print("Enter deposit amount: ");
					double amount = scanner.nextDouble();
					user.deposit(amount);
				}
				else if (choice == 2)
				{
					System.out.print("Enter withdrawal amount: ");
					double amount = scanner.nextDouble();
					user.withdraw(amount);
				}
				else if (choice == 3)
				{
					System.out.println("Goodbye!");
					break;
				}
				else
				{
					System.out.println("Invalid choice!");
				}
			}
		}
		else
		{
			System.out.println("Login failed!");
		}

		scanner.close();
	}
}
