package atminterface;

import java.util.Scanner;

public class UserAccounts {
	Scanner sc = new Scanner(System.in);
	String name;
	long accno;
	int pin;
	String address;
	String bankname;
	String branch;
	double balance;
	static int count=0;
	public void checkPin()
	{
			System.out.println("Enter your pin");
			int userpin= sc.nextInt();
			
			if(userpin==pin)
			{
				menu();
			}
			else
			{
				System.out.println("Please enter valid pin!!!");
				count++;
				if(count<3)
				{
					checkPin();
				}
				else
				{
					System.out.println("You extended the limit...");
				}
			}
	}
	
	public void changePin()
	{
		System.out.println("Enter old Pin");
		int oldpin=sc.nextInt();
		if(oldpin==pin)
		{
			System.out.println("Enter new pin");
			this.pin=sc.nextInt();
			System.out.println("New pin is updated");
		}
		else
		{
			System.out.println("You entered wrong pin");
		}
		
	}
	
	public void checkBalance()
	{
		System.out.println("Total Balance: "+this.balance);
		menu();
	}
	public void withdraw()
	{
		System.out.println("Enter the amount.");
		float amount=sc.nextFloat();
		if(amount>this.balance)
		{
			System.out.println("Insufficient Balance");
		}
		else
		{
			this.balance=this.balance-amount;
			System.out.println("Successful Withdraw!");
		}
		menu();
	}
	public void accountDetails()
	{
		System.out.println("Account Holder's name: "+this.name);
		System.out.println("Account Number: "+this.accno);
		System.out.println("Bank: "+this.bankname);
		System.out.println("Address: "+this.address);
		System.out.println("Total Balance: "+this.balance);
		menu();
	}
	public void deposit()
	{
		System.out.println("Enter the account number");
		long useraccno=sc.nextLong();
		if(this.accno==useraccno)
		{
			accountDetails();
			System.out.println("Enter the amount to deposit");
			double userdeposit=sc.nextDouble();
			this.balance=this.balance+userdeposit;
			System.out.println("Your money deposited successfully.");
			
		}
		else
		{
			System.out.println("Enter the valid account number");
		}
		menu();
	}
	
	public void menu()
	{
		System.out.println("Enter the options");
		System.out.println("1.Change Pin");
		System.out.println("2.Check Balance");
		System.out.println("3.Withdraw");
		System.out.println("4.Deposit");
		System.out.println("5.Account Details");
		System.out.println("6.Exit");
		
		
		//Scanner sc= new Scanner(System.in);
		int useroption=sc.nextInt();
		if(useroption==1)
		{
			changePin();
			menu();
		}
		else if(useroption==2)
		{
			checkBalance();
		}
		else if(useroption==3)
		{
			withdraw();
		}
		else if(useroption==4)
		{
			deposit();
		}
		else if(useroption==5)
		{
			accountDetails();
		}
		else if(useroption==6)
		{
			return;
		}
		else
		{
			System.out.println("Enter valid option");
			menu();
		}
	}
	
}
