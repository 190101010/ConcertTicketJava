//programmer: Kübra YAYLA
//program purpose: Calculating the price of the seats
//Date: 09.04.2022

import java.util.Scanner;

public class ConcertTicket {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		
		System.out.println("please enter the number of seats for A, B and C:\n ");
		
		int numberOfA_Seats = s.nextInt();
		int numberOfB_Seats = s.nextInt();
		int numberOfC_Seats = s.nextInt();
		
		System.out.println("please enter the price of A, B and C\n");
		
		int pricePerA_Seat = s.nextInt();
		int pricePerB_Seat = s.nextInt();
		int pricePerC_Seat = s.nextInt();
		
		int totalAmount = numberOfA_Seats * pricePerA_Seat + numberOfB_Seats * pricePerB_Seat + numberOfC_Seats * pricePerC_Seat;
		System.out.println("the total amount is " + totalAmount + " Turkish Lira");
	}

}
