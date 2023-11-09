package edu.qsp.lms.view;

import java.util.Scanner;
import edu.qsp.lms.controller.*;
import edu.qsp.lms.model.*;

public class view {
static Scanner myInput =new Scanner(System.in);
static LibraryController Controller  = new LibraryController();
static Library library =new Library();

static {
	System.out.println("**-----WELCOME TO LIBRARY MANAGEMENTS SYSTEM-------**");
	//
	System.out.println("Enter name of Library");
	String libraryName = myInput.nextLine();
	library.setLibraryName(libraryName);
	System.out.println("Enter the Address of library");
	String libraryAdderss=myInput.nextLine();
	library.setLibraryAddress(libraryAdderss);
	System.out.println("Enter pin code");
	int libraryPincode =myInput.nextInt();
	myInput.nextLine();
	library.setLibraryPincode(libraryPincode);
}

public static void main(String[] args) {
	do {
		System.out.println("Select operation to perfornm: ");
		System.out.println("1.Add book\n3.Update book\n4.Get Book By Book name\n5.Get All ");
		System.out.println("Enter digit respective to desired option: ");
		int userChoice =myInput.nextInt();
		myInput.nextLine();
		
		switch (userChoice) {
		case 0:
			myInput.close();
			System.out.println("----EXITED----");
			System.exit(0);
			break;
case 1:
	Book book1 = new Book();
	System.out.println("enter book name");
	book1.setBookName(myInput.nextLine());
	System.out.println("Enter author name");
	book1.setBookAuthor(myInput.nextLine());
	System.out.println("Enter book price");
	book1.setPrice(myInput.nextDouble());
//
			Controller.addBook(book1);
			break;
case 2:
	System.out.println("Enter name of the book to be removed: ");
	String bookToBeRemoved =myInput.nextLine();
	boolean verify =Controller.removeBookByBookName(bookToBeRemoved);
	//
	if (verify) {
		System.out.println("book removed from library");
	}
	else {
		System.out.println("book does not exist in library");
	}
	//
	
	break;
case 3:
Book book3 = new Book();
	System.out.println("Enter name of book to update : ");
	String bookToUpadte =myInput.nextLine();
	book3.setBookName(bookToUpadte);
	System.out.println("Enter price to update");
	double newPrice=myInput.nextDouble();
	book3.setPrice(newPrice);
	//
	boolean verifyUpdate = Controller.updateBookPriceByBookName(book3);
	if (verifyUpdate) {
		System.out.println("price update");
	} else {
System.out.println("Mentioned book does not exist in library :");
	}
	
	break;
case 4:
	System.out.println("enter name of book");
	String bookToGet =myInput.nextLine();
	//
	Book book4 =Controller.searchBook(bookToGet);
	if (book4 != null) {
		System.out.println(book4);
		
	} else {
System.out.println("book not found");
	}
	break;
case 5:
	System.out.println(Controller.getAllBooks());
	break;
		default:
			break;
		}
	} while (true);
	
}
}
