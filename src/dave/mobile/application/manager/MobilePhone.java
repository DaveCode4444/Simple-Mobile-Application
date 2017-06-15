package dave.mobile.application.manager;

/*
 * author - Devang Sawant
 * 
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MobilePhone {
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<Contact> contacts = new ArrayList<Contact>();
	
	public static void printContactList(){
		Iterator<Contact> iter = contacts.iterator();
		
		while(iter.hasNext()){
			Contact contact = iter.next();
			System.out.println(contact.toString());
		}
	}
	
	private static void addContact(){
		System.out.print("Enter the name: ");
		String name = sc.next();
		System.out.print("Enter contact no. for "+name+" :");
		String phoneNo = sc.next();
		Contact contact = new Contact(name,phoneNo);
		contacts.add(contact);
	}

	private static void removeContact(){
		System.out.print("Which contact do you want to remove(Please enter the name for the contact): ");
		String name = sc.next();
		boolean noContactFlag = true;
		
		Iterator<Contact> iter = contacts.iterator();
		while(iter.hasNext()){
			Contact contact = iter.next();
			String tempName = contact.getName();
			if(name.equals(tempName)){
				contacts.remove(contact);
				System.out.println("Contact Removed Successfully");
				noContactFlag = false;
				break;
			}
		}
		if(noContactFlag)
		System.out.println("No contact with name "+name+" found");

	}

	private static void modifyContact(){
		System.out.print("Which contact do you want to change(Enter name of the contact): ");
		String nameToChange = sc.next();
		System.out.print("What do you want to change for this Contact(Press 1 for name change or Press 2 for Phone No. change or Press 0 to cancel): ");
		int choice = sc.nextInt();
		boolean flag = true;
		if(choice == 1){
			Iterator<Contact> iter = contacts.iterator();
			while(iter.hasNext()){
				Contact contact = iter.next();
				String name = contact.getName();
				if(name.equals(nameToChange)){
					System.out.println("Enter the new name for this contact: ");
					String newName = sc.next();
					contact.setName(newName);
					System.out.println("Contact Edited successfully");
					flag = false;
					break;
				}
			}
			if(flag){
				System.out.println("Contact Not found");
			}
		}else if(choice == 2){
			Iterator<Contact> iter = contacts.iterator();
			while(iter.hasNext()){
				Contact contact = iter.next();
				String nameNo = contact.getName();
				if(nameNo.equals(nameToChange)){
					System.out.print("Enter the new phone no for this contact: ");
					String newNo = sc.next();
					contact.setPhoneNo(newNo);
					System.out.println("Contact Edited successfully");
					flag = false;
					break;
				}
			}
			if(flag){
				System.out.println("Contact Not found");
			}
		
			
		}

	}

	private static void queryContact(){
		System.out.print("Enter contact name you want to find: ");
		String name = sc.next();
		boolean flag = true;
		Iterator<Contact> iter = contacts.iterator();
		
		while(iter.hasNext()){
			Contact contact = iter.next();
			String conName = contact.getName();
			if(conName.equals(name)){
				System.out.println("Contact exits ---> "+contact.toString());
				flag = false;
				break;
			}
		}
		
		if(flag){
			System.out.println("No contact with name "+name+"  found");
		}

	}

	public static void main(String[] args) {
		System.out.println("*****Welcome to a Simple Mobile Application*****");
		System.out.println("\t Menu Options");
		System.out.println("\t Press 0 for menu options");
		System.out.println("\t Press 1 to add contact");
		System.out.println("\t Press 2 to remove contact");
		System.out.println("\t Press 3 to modify contacts");
		System.out.println("\t Press 4 to query/find contact");
		System.out.println("\t Press 5 to print contacts");
		System.out.println("\t Press 6 to quit application");
		
		boolean flag = false;

		while(!flag){
			System.out.print("Enter your Choice: ");
			int choice = sc.nextInt();
			switch(choice){
				case 0:
					System.out.println("*****Welcome to a Simple Mobile Application*****");
					System.out.println("\t Menu Options");
					System.out.println("\t Press 0 for menu options");
					System.out.println("\t Press 1 to add contact");
					System.out.println("\t Press 2 to remove contact");
					System.out.println("\t Press 3 to modify contacts");
					System.out.println("\t Press 4 to query/find contact");
					System.out.println("\t Press 5 to print contacts");
					System.out.println("\t Press 6 to quit application");
				break;
				case 1:
					addContact();
					break;
				case 2:
					removeContact();
					break;
				case 3:
					modifyContact();
					break;
				case 4:
					queryContact();
					break;
				case 5:
					printContactList();
					break;
				case 6:
					flag = true;
					break;
					
			}
		}
	}

}
