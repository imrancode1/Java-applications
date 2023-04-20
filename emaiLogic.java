package email.admin.com;

import java.util.Scanner;

public class emaiLogic {
	
	
	private String firstName;
	private String lastName;
	private String password;
	private String Department;
	private int defaultPasswordLength = 10;
	
	private int mailBoxCapacity;
	private String alternateEmail;
	
//constructor to receive first name and last name
	public emaiLogic(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED = " + firstName +" "+ lastName);
		
		//call a method for department then return department
				this.Department = SetDepartment();
	System.out.println(this.Department);
	//call a method that returns a random password
		this.password = randmpassword(defaultPasswordLength);
		System.out.println("Your password is = " + password);
		
	}
		//ask for the department
		private String SetDepartment() {
			
			System.out.println("Select the Department : \n1 for Sales \n2 for Development\n3 for Account\n0 for none  ");
			
            Scanner in = new Scanner(System.in);
            int DepChoice = in.nextInt();
if (DepChoice ==1) 
	{return "Sales" ;}
	else if (DepChoice ==2) 
		{return "Development" ;}
		else if (DepChoice ==3) 
			{return "Account" ;}
			else {return "none" ;}
		}
		
		
		//generate random password
	
		private String randmpassword(int length) {
			String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@£$%";
			char[] password = new char[length];
			
			for (int i = 0 ; i<length; i++) {
				int rand = (int)(Math.random() *passwordSet.length());
				password[i] = passwordSet.charAt(rand);
			}
			return new String(password);
			
		}
		
		
		
		//set the mailbox capacity
		
		//set the alternate email
		
		//change password
		
	
	
	
	
	
	
	
	
	}

