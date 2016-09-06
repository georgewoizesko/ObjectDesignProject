package com.ObjectDesignProject;

import java.util.Scanner;

import com.ObjectDesignProject.Components;

public class ObjectDesign{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		String userInputB = null;
		
		
		
			
		int compPart = 0; 
		float compPrice = 0.00f;
		
		boolean userFailed = false;
		
		Components ourComponents = new Components();
		
			System.out.println("Welcome to Computer Professionals Unlimited!");
			System.out.println(" ");
			System.out.println("What kind of computer are you looking for today?");
			String userInputA = sc.nextLine();
			
			
				userFailed = false;
				
			
			
		do {
			System.out.println("How many displays would you like to use with this computer?");
			userInputB = sc.nextLine();

			userFailed = numberIsValid(userInputB);

		} while (userFailed);
		
		compPart = Integer.parseInt(userInputB);
		
		ourComponents.setDisplays(compPart);
		
		do {
			userFailed = false;
			
			System.out.println("How much RAM would you like to have installed?");
			userInputB = sc.nextLine();
			
			 userFailed = numberIsValid(userInputB);
			
			
		} while (userFailed);

		
		compPart = Integer.parseInt(userInputB);
		
		ourComponents.setRam(compPart);
		
		do {
			userFailed = false;
			
			System.out.println("How many processing cores would you like?");
			userInputB = sc.nextLine();
			
			 userFailed = numberIsValid(userInputB);
			
			
		} while (userFailed);

		
		compPart = Integer.parseInt(userInputB);
		
		ourComponents.setCores(compPart);
		
		do {
			userFailed = false;
			
			System.out.println("How many Graphic Processing Units (GPU) would you like?");
			userInputB = sc.nextLine();
			
			 userFailed = numberIsValid(userInputB);
			
			
		} while (userFailed);

		
		compPart = Integer.parseInt(userInputB);
		
		ourComponents.setGpus(compPart);
		
		do {
			userFailed = false;
			
			System.out.println("How much storage space would you like?");
			userInputB = sc.nextLine();
			
			 userFailed = numberIsValid(userInputB);
			
			
		} while (userFailed);

		
		compPart = Integer.parseInt(userInputB);
		
		ourComponents.setStarageSpace(compPart);
	
		do {
			userFailed = false;
			
			System.out.println("How many programs do you plan to install?");
			userInputB = sc.nextLine();
			
			 userFailed = numberIsValid(userInputB);
			
			
		} while (userFailed);

		
		compPart = Integer.parseInt(userInputB);
		
		ourComponents.setPrograms(compPart);
		do {
			userFailed = false;
			
			System.out.println("How much money do you plan to spend?");
			userInputB = sc.nextLine();
			
			 userFailed = numberIsValid(userInputB);
			
			
		} while (userFailed);

		
		compPrice = Float.parseFloat(userInputB);
		
		ourComponents.setBudget(compPart);
		do {
			userFailed = false;
			
			System.out.println("What operating system do you plan to use?");
			userInputB = sc.nextLine();
			
			 userFailed = numberIsValid(userInputB);
			
			
		} while (userFailed);

		
		
		ourComponents.setOperatingSystem(userInputB);
		do {
			userFailed = false;
			
			System.out.println("What will be the primary use for this computer?");
			userInputB = sc.nextLine();
			
			 userFailed = numberIsValid(userInputB);
			
			
		} while (userFailed);

		
			
		ourComponents.setPrimaryUse(userInputB);
		do {
			userFailed = false;
			
			System.out.println("Who will be receiving this computer?");
			userInputB = sc.nextLine();
			
			 userFailed = numberIsValid(userInputB);
			
			
		} while (userFailed);

		
			
		ourComponents.setRecipiant(userInputB);
		do {
			userFailed = false;
			
			System.out.println("Are there any additional comments or requests?");
			userInputB = sc.nextLine();
			
			 userFailed = numberIsValid(userInputB);
			
			
		} while (userFailed);

		
			
		ourComponents.setAddComments(userInputB);
		
		
		
		
		
		System.out.println(ourComponents.toString());
		System.out.println("Thank you for your order! Your " + userInputA + " will be shipped directly to you within 5 business days.");
		
	} // main
	
	public static boolean numberIsValid(String someStringToMakeANumber) {

		try {
			int aNumber = Integer.parseInt(someStringToMakeANumber);
			return false;
			
		} catch (NumberFormatException e) {
			return true;
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	

} // class
