package emailapp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		String firstName, lastName;
		Scanner input = new Scanner(System.in);
		System.out.println("===================================");
		System.out.println("Please enter your first and last name: ");
		System.out.println("===================================");
		System.out.print("First name: ");
		firstName = input.nextLine();
		System.out.print("Last name: ");
		lastName = input.nextLine();
		Email email = new Email(firstName, lastName);
		showMenu(email);
		input.close();
	}
	
	static void showMenu(Email email) {
 		Scanner input = new Scanner(System.in);
 		System.out.println("===================================");
 		System.out.println("Hello, " + email.getFirstName() + " " + email.getLastName() + "!");
 		System.out.println();
 		int menu;
 		do {
 		System.out.println("Would you like to do: ");
 		System.out.println("===================================");
 		System.out.println("1. Set alternative email?");
 		System.out.println("2. Change password?");
 		System.out.println("3. Account information");
 		System.out.println("0. Exit");
 		menu = input.nextInt();
 		switch (menu) {
		case 1:
			System.out.println("===================================");
			input.nextLine();
			System.out.println("Alternative email: ");
			email.setAltEmail(input.nextLine());
			System.out.println("===================================");
			break;
		case 2:
			System.out.println("===================================");
			input.nextLine();
			System.out.println("New password: ");
			email.changePassword(input.nextLine());
			System.out.println("===================================");
			break;
		case 3:
			System.out.println("===================================");
			System.out.println("Name: " + email.getFirstName() + " " + email.getLastName());
			System.out.println("Department: " + email.getDepartment());
			System.out.println("Email: " + email.getEmail());
			System.out.println("Alternative email: " + email.getAltEmail());
			System.out.println("Password: " + email.getPassword());
			System.out.println("===================================");
			break;
		case 0:
			break;
		default:
			System.out.println("Invalid option, please chose 1, 2 or 3!");
			break;
 		}
 		} while (menu != 0);
 		input.close();
 	}
}
