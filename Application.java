package Phonebook;
import java.util.Scanner;


public class Application {

	public static void main(String[] args) {
	Scanner myScanner = new Scanner(System.in);
	
	System.out.println("Welcome!  Please make a selection:");
	System.out.println("1.  Add an entry");
	System.out.println("2.  Search by first name");
	System.out.println("3.  Search by last name");
	System.out.println("4.  Search by full name");
	System.out.println("5.  Search by telephone number");
	System.out.println("6.  Search by city");
	System.out.println("6.  Search by state");
	System.out.println("7.  Delete an entry");
	System.out.println("8.  Update an entry");
	System.out.println("9.  View all entries");
	System.out.println("0.  Exit");

	int selection = myScanner.nextInt();
	
	if(selection == 1){
		Entry entry = new Entry();
		System.out.println("Please enter the first name:");
		String firstName=myScanner.next();
		entry.setFirstName(firstName);
		
		System.out.println("Please enter the last name:");
		String lastName=myScanner.next();
		entry.setLastName(lastName);
		
		System.out.println("Please enter your street address:");
		String streetAddress = myScanner.next();
		entry.setStreetAddress(streetAddress);
		
		System.out.println("Please enter your city:");
		String city = myScanner.next();
		entry.setCity(city);
		
		System.out.println("Please enter your state:");
		String state = myScanner.next();
		entry.setState(state);
		
		System.out.println("Please enter your zip code:");
		String zipCode = myScanner.next();
		entry.setZipCode(zipCode);
		
		System.out.println("Please enter your telephone number:");
		String teleNum = myScanner.next();
		entry.setTeleNum(teleNum);
		
		
		
	}
	
	if(selection == 2){
		
	}
	
if(selection == 3){
		
	}
	
if(selection == 4){
	
}
	
if(selection == 5){
	
}	
	
if(selection == 6){
	
}	
	
if(selection == 7){
	
}	

if(selection == 8){
	
}

if(selection == 9){
	
}

if(selection == 0){
	
}




	myScanner.close();
	}

}


//Write a program to simulate the actions of a phonebook. (Due Friday July 17th) 
//Your program should be able to :
//Add new entries 
//Search for an existing entry
//Search by first name *
//Search by last name *
//Search by full name *note name is not unique therefore the result should be an array of Person Objects.
//Search by telephone number
//Search by city or state
//Delete a record for a given telephone number
//Update a record for a given telephone number
//Show all records in asc order *note you will need to research sorting on an array.
//An option to exit the program 
//Your program should operate on the console. It should display all the choices when the program loads. Eg 1. Add new record
//    2. Delete a record
//               Etc.. where 1 representing the action for adding a record and 2 representing the action
//               for deleting a record.
//Your program should run until the user selects the exit option. 
//Your program should have a minimum of 2 classes a Person class, an Address  class.
//
//Test case :
//John Doe, 114 Market St, St Louis, MO, 63403, 6366435698
//John E Doe, 324 Main St, St Charles, MO,63303, 8475390126
//John Michael West Doe, 574 Pole ave, St. Peters, MO, 63333, 5628592375
//
//Note: Test cases should work when copy and paste into the console as one entry (as is).
//           ONLY ARRAYS ARE ALLOWED, NO ARRAYLIST.
// 
//Searching for John should return a list of all 3 records above, displaying the telephone number in this order (636)-453-8563.
//
//Optional add additional features to your program, for storing cell, home, work and fax numbers. 
//Also features for storing events like birthday, anniversary, email… etc