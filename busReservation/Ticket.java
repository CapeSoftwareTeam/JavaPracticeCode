package busReservation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ticket {
	
	static String type1 = "AC";
	static String type2 = "NAC";
	static String coach1 = "Sleeper";
	static String coach2 = "Seater";
	static int tickets;
	
	
	public void errorMsg() {
		System.out.println("Error!,Enter correct type(sleeper/seater)");
		System.out.println("Please run the program!");
		System.out.println("--------------------------------------------------------------------------------");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Ticket ticket = new Ticket();
		Busticket busTicket = new Busticket();
		ArrayList<String> place = new ArrayList<String>();

		place.add("Coimbatore");
		place.add("Erode");
		place.add("Salem");
		place.add("Vilupuram");
		place.add("Chengalpattu");
		place.add("Chennai");

		System.out.println("Welcome to Bus Ticket Booking");
		System.out.println("<--- Chennai To Coimbatore --->");
		System.out.println("--------------------------------------------------------------------------------");

		System.out.println("<!--- Choose place to book your ticket (1-6) ---!>");
		int k = 0;
		for (int i = 0; i < place.size(); i++) {
			k++;
			System.out.println(k + " " + place.get(i));
		}

		System.out.println("--------------------------------------------------------------------------------");

		// choosing place
		int book = scan.nextInt();
		switch (book) {
		case 1:
			System.out.println("Coimbatore");
			int C_AC_Sl = 900;
			int C_AC_S = 750;
			int C_NAC_Sl = 700;
			int C_NAC_S = 550;
			
			displayContent("Coimbatore",C_AC_Sl,C_AC_S,C_NAC_Sl,C_NAC_S);
			
			String tic = scan.next();
			System.out.println("--------------------------------------------------------------------------------");
			if (tic.equalsIgnoreCase(type1)) {
				System.out.println("Choose your type(sleeper/seater): ");
				String chType = scan.next();
				if (chType.equalsIgnoreCase(coach1)) {
					System.out.println("--------------------------------------------------------------------------------");
					
//					System.out.println("Enter how tickets you want");
//					tickets = scan.nextInt();
//					= tickets * C_AC_Sl;
//					System.out.println("Your ticket price is:" + tic_pay);
                     
				//	int tic_pay = C_AC_Sl;
					// bus ticket calculation
					busTicket.display(C_AC_Sl);

	
					System.out.println("--------------------------------------------------------------------------------");
				 
				} else if (chType.equalsIgnoreCase(coach2)) {
					
					busTicket.display(C_AC_S);
				//	int C_tic = scan.nextInt();
	//				System.out.println(					"--------------------------------------------------------------------------------");
//					if (C_tic == C_AC_S) {
//						System.out.println("Your ticket booked! Coimbatore Seater (AC)");
//						System.out.println("Happy Journey!");
//						System.out.println("Thank you for choosing us!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//
//					} else {
//						System.out.println("Warning!,Please enter correct payment!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//			}

				}

			} else if (tic.equalsIgnoreCase(type2)) {
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("Choose your type(sleeper/seater): ");
				String chType = scan.next();
				if (chType.equalsIgnoreCase(coach1)) {
					
					busTicket.display(C_NAC_Sl);
					
//					System.out.println("Enter payment (700): ");
//					int C_tic = scan.nextInt();
//					System.out.println(
//							"--------------------------------------------------------------------------------");
//					if (C_tic == C_NAC_Sl) {
//						System.out.println("Your ticket booked! Coimbatore Sleeper (NAC)");
//						System.out.println("Happy Journey!");
//						System.out.println("Thank you for choosing us!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//					} else {
//						System.out.println("Warning!,Please enter correct payment!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//					}
				} else if (chType.equalsIgnoreCase(coach2)) {
			
					System.out.println(	"--------------------------------------------------------------------------------");
                        
					busTicket.display(C_NAC_S);
	                 
					//					System.out.println("Enter payment (550): ");
//					int C_tic = scan.nextInt();
//					System.out.println(
//							"--------------------------------------------------------------------------------");
//					if (C_tic == C_NAC_S) {
//						System.out.println("Your ticket booked! Coimbatore Seater (NAC)");
//						System.out.println("Happy Journey!");
//						System.out.println("Thank you for choosing us!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//					} else {
//						System.out.println("Warning!,Please enter correct payment!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//					}
     			}

			} else {
			      ticket.errorMsg();
			      
			}

			break;
		case 2:
			System.out.println("Erode");
			int E_AC_Sl = 850;
			int E_AC_S = 700;
			int E_NAC_Sl = 600;
			int E_NAC_S = 450;
			
			displayContent("Erode",E_AC_Sl,E_AC_S,E_NAC_Sl,E_NAC_S);
			
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("Choose your ticket (AC/NAC):");

			String E_tic = scan.next();
			System.out.println("--------------------------------------------------------------------------------");
			if (E_tic.equalsIgnoreCase(type1)) {
				System.out.println("Choose your type(sleeper/seater): ");
				String chType = scan.next();
				if (chType.equalsIgnoreCase(coach1)) {
					System.out.println(	"--------------------------------------------------------------------------------");
                    
					busTicket.display(E_AC_Sl);
					//					System.out.println("Enter payment (850): ");
//					int E_pay_sl = scan.nextInt();
//					System.out.println(
//							"--------------------------------------------------------------------------------");
//					if (E_pay_sl == E_AC_Sl) {
//						System.out.println("Your ticket booked! Erode Sleeper (AC)");
//						System.out.println("Happy Journey!");
//						System.out.println("Thank you for choosing us!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//					} else {
//						System.out.println("Warning!,Please enter correct payment!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//					}
				} else if (chType.equalsIgnoreCase(coach2)) {

					System.out.println(	"--------------------------------------------------------------------------------");

					busTicket.display(E_AC_S);
//					System.out.println("Enter payment (700): ");
//					int E_pay_s = scan.nextInt();
//					System.out.println(
//							"--------------------------------------------------------------------------------");
//
//					if (E_pay_s == E_AC_S) {
//						System.out.println("Your ticket booked! Erode Seater (AC)");
//						System.out.println("Happy Journey!");
//						System.out.println("Thank you for choosing us!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//					} else {
//						System.out.println("Warning!,Please enter correct payment!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//					}
				}

			} else if (E_tic.equalsIgnoreCase(type2)) {
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("Choose your type(sleeper/seater): ");
				String chType = scan.next();
				System.out.println("--------------------------------------------------------------------------------");
				
				if (chType.equalsIgnoreCase(coach1)) {
					
					busTicket.display(E_NAC_Sl);
					
//					System.out.println("Enter payment (600): ");
//					int E_tic_NAC = scan.nextInt();
//					System.out.println(
//							"--------------------------------------------------------------------------------");
//					if (E_tic_NAC == E_NAC_Sl) {
//						System.out.println("Your ticket booked! Erode Sleeper (NAC)");
//						System.out.println("Happy Journey!");
//						System.out.println("Thank you for choosing us!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//					} else {
//						System.out.println("Warning!,Please enter correct payment!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//					}
				} else if (chType.equalsIgnoreCase(coach2)) {
					
					System.out.println("--------------------------------------------------------------------------------");

					
					busTicket.display(E_NAC_S);
					
//					System.out.println("Enter payment (450): ");
//					int E_tic_ = scan.nextInt();
//					System.out.println(
//							"--------------------------------------------------------------------------------");
//					if (E_tic_ == E_NAC_S) {
//						System.out.println("Your ticket booked! Erode Seater (NAC)");
//						System.out.println("Happy Journey!");
//						System.out.println("Thank you for choosing us!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//					} else {
//						System.out.println("Warning!,Please enter correct payment!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//					}
				}

			} else {
				 ticket.errorMsg();
			}

			break;
		case 3:
			System.out.println("Salem");
			int S_AC_Sl = 700;
			int S_AC_S = 600;
			int S_NAC_Sl = 500;
			int S_NAC_S = 400;

			displayContent("Salem",S_AC_Sl,S_AC_S,S_NAC_Sl,S_NAC_S);
			
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("Choose your ticket (AC/NAC): ");

			String S_tic = scan.next();

			if (S_tic.equalsIgnoreCase(type1)) {
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("Choose your type(sleeper/seater): ");
				String chType = scan.next();
				if (chType.equalsIgnoreCase(coach1)) {
					System.out.println("--------------------------------------------------------------------------------");
					busTicket.display(S_NAC_Sl);

//					System.out.println("Enter payment (700): ");
//					int S_pay_sl = scan.nextInt();
//					System.out.println(
//							"--------------------------------------------------------------------------------");
//					if (S_pay_sl == S_AC_Sl) {
//						System.out.println("Your ticket booked! Salem Sleeper (AC)");
//						System.out.println("Happy Journey!");
//						System.out.println("Thank you for choosing us!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//					} else {
//						System.out.println("Warning!,Please enter correct payment!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//					}
				} else if (chType.equalsIgnoreCase(coach2)) {
					
					System.out.println(	"--------------------------------------------------------------------------------");
					
					busTicket.display(S_AC_S);

					
//					System.out.println("Enter payment (600): ");
//					int S_pay_s = scan.nextInt();
//					System.out.println(	"--------------------------------------------------------------------------------");
//					if (S_pay_s == S_AC_S) {
//						System.out.println("Your ticket booked! Salem Seater (AC)");
//						System.out.println("Happy Journey!");
//						System.out.println("Thank you for choosing us!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//					} else {
//						System.out.println("Warning!,Please enter correct payment!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//					}
//				}

			} else if (S_tic.equalsIgnoreCase(type2)) {
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("Choose your type(sleeper/seater): ");
				  chType = scan.next();
				System.out.println("--------------------------------------------------------------------------------");
				
				if (chType.equalsIgnoreCase(coach1)) {
					
					busTicket.display(S_NAC_Sl);

				}
//					System.out.println("Enter payment (500): ");
//					int S_tic_NAC = scan.nextInt();
//					System.out.println(
//							"--------------------------------------------------------------------------------");
//					if (S_tic_NAC == S_NAC_Sl) {
//						System.out.println("Your ticket booked! Salem Sleeper (NAC)");
//						System.out.println("Happy Journey!");
//						System.out.println("Thank you for choosing us!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//					} else {
//						System.out.println("Warning!,Please enter correct payment!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//					}
				} else if (chType.equalsIgnoreCase(coach2)) {
					System.out.println(	"--------------------------------------------------------------------------------");
					
					busTicket.display(S_NAC_Sl);

					
//					System.out.println("Enter payment (400): ");
//					int S_tic_ = scan.nextInt();
//					System.out.println(
//							"--------------------------------------------------------------------------------");
//					if (S_tic_ == S_NAC_S) {
//						System.out.println("Your ticket booked! Salem Seater (NAC)");
//						System.out.println("Happy Journey!");
//						System.out.println("Thank you for choosing us!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//
//					} else {
//						System.out.println("Warning!,Please enter correct payment!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//					}
				}

			} else {
				 ticket.errorMsg();
			}

			break;
		case 4:
			System.out.println("Vilupuram");
			int V_AC_Sl = 650;
			int V_AC_S = 550;
			int V_NAC_Sl = 450;
			int V_NAC_S = 350;
		
			displayContent("Vilupuram",V_AC_Sl,V_AC_S,V_NAC_Sl,V_NAC_S);
			
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("Choose your ticket (AC/NAC) ");

			String V_tic = scan.next();
			System.out.println("--------------------------------------------------------------------------------");

			if (V_tic.equalsIgnoreCase(type1)) {
				System.out.println("Choose your type(sleeper/seater): ");
				String chType = scan.next();
				System.out.println("--------------------------------------------------------------------------------");
				if (chType.equalsIgnoreCase(coach1)) {
					
					busTicket.display(V_AC_Sl);

					
//					System.out.println("Enter payment (650): ");
//					int V_pay_sl = scan.nextInt();
//					System.out.println(
//							"--------------------------------------------------------------------------------");
//					if (V_pay_sl == V_AC_Sl) {
//						System.out.println("Your ticket booked! Vilupuram Sleeper (AC)");
//						System.out.println("Happy Journey!");
//						System.out.println("Thank you for choosing us!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//					} else {
//						System.out.println("Warning!,Please enter correct payment!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//					}
				} else if (chType.equalsIgnoreCase(coach2)) {
					
					System.out.println("--------------------------------------------------------------------------------");
					
					
					busTicket.display(V_AC_S);

					
					
//					System.out.println("Enter payment (550): ");
//					int V_pay_s = scan.nextInt();
//					System.out.println(
//							"--------------------------------------------------------------------------------");
//					if (V_pay_s == V_AC_S) {
//						System.out.println("Your ticket booked! Vilupuram Seater (AC)");
//						System.out.println("Happy Journey!");
//						System.out.println("Thank you for choosing us!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//					} else {
//						System.out.println("Warning!,Please enter correct payment!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//					}
				}

			} else if (V_tic.equalsIgnoreCase(type2)) {
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("Choose your type(sleeper/seater): ");
				String chType = scan.next();
				System.out.println("--------------------------------------------------------------------------------");
				if (chType.equalsIgnoreCase(coach1)) {
					
					busTicket.display(V_NAC_Sl);

					
//					System.out.println("Enter payment (450): ");
//					int V_tic_NAC = scan.nextInt();
//					System.out.println(
//							"--------------------------------------------------------------------------------");
//					if (V_tic_NAC == V_NAC_Sl) {
//						System.out.println("Your ticket booked! Vilupuram Sleeper (NAC)");
//						System.out.println("Happy Journey!");
//						System.out.println("Thank you for choosing us!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//					} else {
//						System.out.println("Warning!,Please enter correct payment!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//					}
				} else if (chType.equalsIgnoreCase(coach2)) {
					
					busTicket.display(V_NAC_S);

					
//					System.out.println("Enter payment (350): ");
//					int V_tic_ = scan.nextInt();
//					System.out.println(
//							"--------------------------------------------------------------------------------");
//					if (V_tic_ == V_NAC_S) {
//						System.out.println("Your ticket booked! Vilupuram Seater (NAC)");
//						System.out.println("Happy Journey!");
//						System.out.println("Thank you for choosing us!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//					} else {
//						System.out.println("Warning!,Please enter correct payment!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//
//					}
				}

			} else {
				 ticket.errorMsg();
			}

			break;
		case 5:
			System.out.println("Chengalpattu");
			int Cp_AC_Sl = 700;
			int Cp_AC_S = 600;
			int Cp_NAC_Sl = 500;
			int Cp_NAC_S = 450;
			
			displayContent("Chengalpattu",Cp_AC_Sl,Cp_AC_S,Cp_NAC_Sl,Cp_NAC_S);
			
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("Choose your ticket (AC/NAC): ");

			String Cp_tic = scan.next();
			System.out.println("--------------------------------------------------------------------------------");

			if (Cp_tic.equalsIgnoreCase(type1)) {
				System.out.println("Choose your type(sleeper/seater): ");
				String chType = scan.next();
				System.out.println("--------------------------------------------------------------------------------");

				if (chType.equalsIgnoreCase(coach1)) {
					
					busTicket.display(Cp_AC_Sl);

					
//					System.out.println("Enter payment (700): ");
//					int Cp_pay_sl = scan.nextInt();
//					System.out.println(
//							"--------------------------------------------------------------------------------");
//
//					if (Cp_pay_sl == Cp_AC_Sl) {
//						System.out.println("Your ticket booked! Chengalpattu Sleeper (AC)");
//						System.out.println("Happy Journey!");
//						System.out.println("Thank you for choosing us!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//					} else {
//						System.out.println("Warning!,Please enter correct payment!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//					}
				} else if (chType.equalsIgnoreCase(coach2)) {
					
					
					busTicket.display(Cp_AC_S);
					
					
//					System.out.println("Enter payment (600): ");
//					int Cp_pay_s = scan.nextInt();
//					System.out.println(
//							"--------------------------------------------------------------------------------");
//					if (Cp_pay_s == Cp_AC_S) {
//						System.out.println("Your ticket booked! Chengalpattu Seater (AC)");
//						System.out.println("Happy Journey!");
//						System.out.println("Thank you for choosing us!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//					} else {
//						System.out.println("Warning!,Please enter correct payment!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//					}
				}

			} else if (Cp_tic.equalsIgnoreCase(type2)) {
				System.out.println("Choose your type(sleeper/seater): ");
				String chType = scan.next();
				System.out.println("--------------------------------------------------------------------------------");

				if (chType.equalsIgnoreCase(coach1)) {
					
					busTicket.display(Cp_NAC_Sl);

					
//					System.out.println("Enter payment (500): ");
//					int Cp_tic_NAC = scan.nextInt();
//					System.out.println(
//							"--------------------------------------------------------------------------------");
//					if (Cp_tic_NAC == Cp_NAC_Sl) {
//						System.out.println("Your ticket booked! Chengalpattu Sleeper (NAC)");
//						System.out.println("Happy Journey!");
//						System.out.println("Thank you for choosing us!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//					} else {
//						System.out.println("Warning!,Please enter correct payment!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//					}
				} else if (chType.equalsIgnoreCase(coach2)) {
					
					busTicket.display(Cp_NAC_S);

					
//					System.out.println("Enter payment (450): ");
//					int Cp_tic_ = scan.nextInt();
//					System.out.println(
//							"--------------------------------------------------------------------------------");
//
//					if (Cp_tic_ == Cp_NAC_S) {
//						System.out.println("Your ticket booked! Chengalpattu Seater (NAC)");
//						System.out.println("Happy Journey!");
//						System.out.println("Thank you for choosing us!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//
//					} else {
//						System.out.println("Warning!,Please enter correct payment!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//
//					}
				}

			} else {
				 ticket.errorMsg();
			}

			break;
		case 6:
			System.out.println("Chennai");
			int Ch_AC_Sl = 900;
			int Ch_AC_S = 800;
			int Ch_NAC_Sl = 750;
			int Ch_NAC_S = 600;
			
			displayContent("Chennai",Ch_AC_Sl,Ch_AC_S,Ch_NAC_Sl,Ch_NAC_S);

			System.out.println("--------------------------------------------------------------------------------");

			System.out.println("Choose your ticket (AC/NAC): ");

			String Ch_tic = scan.next();
			System.out.println("--------------------------------------------------------------------------------");

			if (Ch_tic.equalsIgnoreCase(type1)) {
				System.out.println("Choose your type(sleeper/seater): ");
				String chType = scan.next();
				System.out.println("--------------------------------------------------------------------------------");
				if (chType.equalsIgnoreCase(coach1)) {
					
					busTicket.display(Ch_AC_Sl);

					
//					System.out.println("Enter payment (900): ");
//					int Ch_pay_sl = scan.nextInt();
//					System.out.println(
//							"--------------------------------------------------------------------------------");
//					if (Ch_pay_sl == Ch_AC_Sl) {
//						System.out.println("Your ticket booked! Chennai Sleeper (AC)");
//						System.out.println("Happy Journey!");
//						System.out.println("Thank you for choosing us!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//
//					} else {
//						System.out.println("Warning!,Please enter correct payment!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//					}
				} else if (chType.equalsIgnoreCase(coach2)) {
					
					busTicket.display(Ch_AC_S);

					
//					System.out.println("Enter payment (800): ");
//					int Ch_pay_s = scan.nextInt();
//					System.out.println(
//							"--------------------------------------------------------------------------------");
//					if (Ch_pay_s == Ch_AC_S) {
//						System.out.println("Your ticket booked! Chennai Seater (AC)");
//						System.out.println("Happy Journey!");
//						System.out.println("Thank you for choosing us!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//
//					} else {
//						System.out.println("Warning!,Please enter correct payment!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//
//					}
				}

			} else if (Ch_tic.equalsIgnoreCase(type2)) {
				System.out.println("Choose your type(sleeper/seater): ");
				String chType = scan.next();
				System.out.println("--------------------------------------------------------------------------------");
				if (chType.equalsIgnoreCase(coach1)) {
					
					
					busTicket.display(Ch_NAC_Sl);

					
//					System.out.println("Enter payment (750): ");
//					int Ch_tic_NAC = scan.nextInt();
//					System.out.println(
//							"--------------------------------------------------------------------------------");
//					if (Ch_tic_NAC == Ch_NAC_Sl) {
//						System.out.println("Your ticket booked! Chennai Sleeper (NAC)");
//						System.out.println("Happy Journey!");
//						System.out.println("Thank you for choosing us!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//
//					} else {
//						System.out.println("Warning!,Please enter correct payment!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//					}
				} else if (chType.equalsIgnoreCase(coach2)) {
					
					busTicket.display(Ch_NAC_S);
					
					
//					System.out.println("Enter payment (600): ");
//					int Ch_tic_ = scan.nextInt();
//					System.out.println(
//							"--------------------------------------------------------------------------------");
//					if (Ch_tic_ == Ch_NAC_S) {
//						System.out.println("Your ticket booked! Chennai Seater (NAC)");
//						System.out.println("Happy Journey!");
//						System.out.println("Thank you for choosing us!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//					} else {
//						System.out.println("Warning!,Please enter correct payment!");
//						System.out.println(
//								"--------------------------------------------------------------------------------");
//					}
				}

			} else {
				 ticket.errorMsg();
			}

			break;
		default:
			System.out.println("You entered a wrong place!");
			System.out.println("Please Re-run the program");
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("--------------------------------------------------------------------------------");

		}
		scan.close();
	}

	private static void displayContent(String stops,int ACSL,int ACS,int NACSL,int NACS) {
		
		
		System.out.println(stops+" AC ticket  Sleeper :" + ACSL);
		System.out.println(stops +" AC ticket Seater " + ACS);
		System.out.println(stops+ " NAC ticket Sleeper: " + NACSL);
		System.out.println(stops+" AC ticket Seater: " + NACS);
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("Choose your ticket (AC/NAC):");
		
	}

}
