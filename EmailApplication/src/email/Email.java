package email;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private String email;
	private int mailboxCapacity=500;
	private String alternateEmail;
	private int defaultPasswordLength=10;
	private String companySuffix="company.com";
	
	public Email(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		System.out.println("Email created for "+this.firstName+" "+this.lastName);
		this.department=setDepartment();
		System.out.println("Department is "+department);
		this.password=randomPassword(defaultPasswordLength);
		System.out.println("your passowrd is "+this.password);
		email= firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+ companySuffix;
		System.out.println("yor email is "+email);
	}
	
	private String setDepartment() {
		System.out.println("Department codes are \n 1. sales\n2. development\n3. accounting\n0 none\nEnter the department");
		Scanner sc=new Scanner(System.in);
		int deptChoice=sc.nextInt();
		if(deptChoice==1) {return "sales";}
		else if(deptChoice==2) {return "development";}
		else if(deptChoice==3) {return "accounting";}
		else {return "";}

	}
	private String randomPassword(int Length) {
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password= new char[Length];
		for(int i=0; i<Length;i++) {
			int ran=(int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(ran);
		}
		return new String(password);
	}
	
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity=capacity;
	}
	
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail=altEmail;
	}
	
	public void changePassword(String password) {
		this.password=password;
	}
	
	public int getMailBoxCapacity() {
		return mailboxCapacity;
	}
	
	public String getALternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "name: "+firstName+ " "+ lastName+ "company email: "+ email+"mailbox capacity: "+mailboxCapacity +"mb";
		
	}
}