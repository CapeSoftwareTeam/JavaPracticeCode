package busReservation;

import java.util.Scanner;

public class Busticket {

	public void display(int ticketPrice) {
		Scanner sc = new Scanner(System.in);
		int payment, remainingBalance, returningChange, totalAmount;
		System.out.println("Enter how many tickets:");
		int numberOfTickets = sc.nextInt();
		totalAmount = numberOfTickets * ticketPrice;
		System.out.println("Your total ticket price  is:" + totalAmount);
		System.out.println("Please do payment here:");
		payment = sc.nextInt();
		if (payment < totalAmount) {
			remainingBalance = totalAmount - payment;
			System.out.println("Please complete your payment:Your balance:" + remainingBalance);
			System.out.println("Complete your payment:");
			payment = sc.nextInt();

			if (payment > remainingBalance) {
				returningChange = payment - remainingBalance;
				System.out.println("Please collect your change:" + returningChange);
				System.out.println("Your ticket booked!");
				System.out.println("Thank you for choosing us.");
			} else if (payment == remainingBalance) {
				System.out.println("Your ticket Confirmed!");
				System.out.println("Happy journey!");
				System.out.println("Thank your for choosing us!");
			} else {
				System.out.println("Please do coorect payment!");
			}
		} else if (payment == totalAmount) {
			System.out.println("Your ticket Confirmed!");
			System.out.println("Happy Journey!");
			System.out.println("Thanks for choosing us!");

		} else {
			returningChange = payment - totalAmount;
			System.out.println("Please collect your change:" + returningChange);
			System.out.println("Your ticket confirmed!");
			System.out.println("Happy Journey!");
			System.out.println("Thank you for choosing us.");

		}
		sc.close();
	}
}
