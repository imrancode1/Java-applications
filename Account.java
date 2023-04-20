package bank.com;
import java.util.Scanner;

//initialise variables
public class Account {
int balance;
int previousTransaction;
String CustomerName;
String CustomerID;

//TODO Auto-generated constructor stub
	public Account(String cname,String cid) {
	
		CustomerName = cname;
		CustomerID = cid;
		
		
	}

	//method for depositing money
	
void deposit(int amount) {


if(amount !=0) {
	
	balance = balance + amount;
	previousTransaction = amount;
}
}

//method for Withdrawl of money


void Withdraw(int amount) {
	if (amount !=0) {
		
		balance = balance - amount;
		previousTransaction = -amount;
		
	}
}

//Method for Previous Transaction
void getpreviousTransaction() {
	if (previousTransaction > 0) {
		System.out.println("Deposited = " + previousTransaction );
	}
	else if(previousTransaction<0) {
		System.out.println("Withdrawn = " + Math.abs(previousTransaction));}
	
		else {
			System.out.println("No TRASACNTION DONE");
			
		}
		
	}
//method to calculate Interest

void CalculateInterest(int years) {
	
	double InterestRate = 0.520;
	double newBalance = (balance * years * InterestRate) + balance;
	System.out.println("The current interest rate is = " + (100* InterestRate));
	System.out.println("After" +years+ "years, your balance will be = " + newBalance );}	


//method to show main menu
void showMenu() {
	char option = '\0';
	Scanner scanner = new Scanner(System.in);
	System.out.println("Welcome + "+ CustomerName + "!!");
	System.out.println( "Your ID is  " + CustomerID );
	System.out.println();
	System.out.println( "What would you like to do today?");
	System.out.println();
	System.out.println("A. Check your balance");
	System.out.println("B. Make a deposit");
	System.out.println("C. Make a Withdrawl");
	System.out.println("D.View Previous Transaction");
	System.out.println("E.Calculate Interest"); 
	System.out.println("F. Exit");
	
	do {
		
		System.out.println();
		System.out.println("Enter an option");
		char option1 = scanner.next().charAt(0);
		option = Character.toUpperCase(option1);
		System.out.println();
		
		switch (option) {                      //case A allows the user to check the balance
		case 'A':
			System.out.println();
			System.out.println("***********************************************");
			System.out.println("Your balance amount is = " + "$" +  balance);
			System.out.println("**********************************************");
			System.out.println();
			break;
			
			case 'B':
				System.out.println();
				System.out.println("***********************************************");
				System.out.println("Enter an amont to deposit");
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println();
				break;
				
			case'C':
				
				System.out.println();
				System.out.println("***********************************************");
				System.out.println("Enter amount to withdraw");
				
				int amount2 = scanner.nextInt();
				Withdraw(amount2);
				System.out.println();
				System.out.println("***********************************************");
				break;
			
			case 'D':
				
				System.out.println();
				System.out.println("***********************************************");
				getpreviousTransaction();
				System.out.println();
				System.out.println("***********************************************");
				break;
				
			case 'E':
				
			System.out.println();
			System.out.println("***********************************************");
			System.out.println("Enter number of years you want to calculate interest for");
			int years = scanner.nextInt();
			CalculateInterest(years);
			System.out.println();
			System.out.println("***********************************************");
			break;
			
			case 'F':
				System.out.println();
				System.out.println("***********************************************");
				break;
				default:
					System.out.println();
					System.out.println("***********************************************");
					System.out.println("Invalid option! Please enter correct option");
					break;
		}
	}
	
		while(option !='F');
		
		{
			System.out.println("Thank you for Banking with us");
		}
		
}
}








