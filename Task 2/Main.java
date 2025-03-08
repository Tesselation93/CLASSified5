// Remember to import the Scanner class from the util library: import java.util.Scanner; 

import java.util.Scanner;

public class Main {
	 
	public static void main (String [] args){

// Create a Scanner object for reading from the command line - make scanner accessible nb. always put in main 

Scanner scanner = new Scanner(System.in);

// In the main method start by printing this message to the user: "Please type your name"

	System.out.println("Please type your name");

// Declare a String variable name and assign to it whatever is returned from a call to scanner's nextLine() method - Scanner is only used when we expect user input

String name = scanner.nextLine();

// Print the name of the user in a greeting (i.e. "Hello <name>") followed by the message "Please type your age"

	System.out.println ("Hello " + name + ". Please type your age: ");

int age = scanner.nextInt();

// Print the value the user writes (the age variable) i.e. like this: "You are <age> years old".
	System.out.println ("You are: " + age + " years old.");

int ageOfRetirement = 67;
int retirementYearsLeft = ageOfRetirement - age;

// Declare another variable of type int called age and assign to it the value returned by the nextInt() method of the Scanner object (reuse the Scanner object created in 2.c).

// Declare a third variable of type int. To this variable, assign the calculated number of years until the user can retire. You may assume retirement starts at age 67. Print the result (i.e. like this: "You have <x> years until retirement").
	
	System.out.println ("You have: " + retirementYearsLeft + " until retirement.");

	scanner.close();

	}
}
