package javapractices;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    Scanner nw= new Scanner(System.in);    //expect to take input
		
		System.out.println("Enter a number");
		
		int okay=nw.nextInt();         //expect to provide the values
		
		System.out.println("Entered a number is " + okay);
		
		String okay1=nw.next();  
		
		System.out.println("Entered a name is " + okay1);


	}

}

