package emailapp;

import java.util.Scanner;

public class Email {
 	private String firstName;
 	private String lastName;
 	private String password;
 	private String department;
 	private String email;
 	private String altEmail;
 	private String company = "martincrosoft.com";
 	private int passwordLenght = 10;
 	
 	public Email(String firstName, String lastName) {
 		this.firstName = firstName;
 		this.lastName = lastName;
 		System.out.println("===================================");
 		this.department = setDepartment();
 		this.password = randomPassword(passwordLenght);
 		this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + company;
 		
 	}
 	
 	private String randomPassword(int lenght) {
 		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
 		char[] password = new char[lenght];
 		int random;
 		for (int i = 0; i < lenght; i++) {
 			random = (int) (Math.random() * passwordSet.length());
 			password[i] = passwordSet.charAt(random);
 		}
 		return new String (password);
 	}
 	
 	private String setDepartment() {
 		System.out.println("Enter department:");
 		System.out.println("===================================");
 		System.out.println("1 for Sales");
 		System.out.println("2 for Development");
 		System.out.println("3 for Accounting");
 		System.out.println("0 for none");
 		
 		Scanner input = new Scanner(System.in);
 		int dep = input.nextInt();
 		if (dep == 1) {
 			return "Sales";
 		} else if (dep == 2) {
 			return "Development";
 		} else if (dep == 3) {
 			return "Accounting";
 		} else {
 			return "";
 		}
 	}
 	
 	public void setAltEmail(String altEmail) {
 		this.altEmail = altEmail;
 	}
 	
 	public void changePassword(String password) {
 		this.password = password;
 	}
 	
 	public String getAltEmail() {
 		return altEmail;
 	}
 	
 	public String getPassword() {
 		return password;
 	}
 	
 	public String getEmail() {
 		return email;
 	}
 	
 	public String getFirstName() {
 		return firstName;
 	}
 	
 	public String getLastName() {
 		return lastName;
 	}
 	
 	public String getDepartment() {
 		return department;
 	}
}
