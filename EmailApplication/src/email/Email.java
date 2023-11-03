package email;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private int mailboxCapacity;
	private String alternateEmail;
	
	public Email(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		System.out.println("Email created for "+this.firstName+" "+this.lastName);
		this.department=setDepartment();
		System.out.println("Department is "+department);
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
}