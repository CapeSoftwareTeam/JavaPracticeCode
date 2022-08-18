import java.util.Scanner;
public class BusTicket {
	static String type1 = "AC";
	static String type2 = "NAC";
	static String coach1 = "Sleeper";
	static String coach2 = "Seater";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("<--- Chennai To Coimbatore --->");
		System.out.println("--------------------------------------------------------------------------------");

		String a = "Coimbatore";
		String b = "Erode";
		String c = "Salem";
		String d = "Vilupuram";
		String e = "Chengalpattu";
		String f = "Chennai";
	

		System.out.println("<!--- Choose place to book your ticket (1-6) ---!>");
		System.out.println("Enter 1 for: "+a);
		System.out.println("Enter 2 for: "+b);
		System.out.println("Enter 3 for: "+c);
		System.out.println("Enter 4 for: "+d);
		System.out.println("Enter 5 for: "+e);
		System.out.println("Enter 6 for: "+f);
		System.out.println("--------------------------------------------------------------------------------");
		
		
		
		//choosing place 
		int place = scan.nextInt();
		switch (place) {
		case 1:
			System.out.println("Coimbatore");
			int C_AC_Sl = 900;
			int C_AC_S = 750;
			int C_NAC_Sl = 700;
			int C_NAC_S = 550;
			System.out.println("Coimbatore AC ticket  Sleeper :" + C_AC_Sl);
			System.out.println("Coimbatore AC ticket Seater " + C_AC_S);
			System.out.println("Coimbatore NAC ticket Sleeper: " + C_NAC_Sl);
			System.out.println("Coimbatore AC ticket Seater: " + C_NAC_S);
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("Choose your ticket (AC/NAC):");
			String tic = scan.next();
			System.out.println("--------------------------------------------------------------------------------");
			if(tic .equalsIgnoreCase(type1)) {
				System.out.println("Choose your type(sleeper/seater): ");
				String chType = scan.next();
				if(chType .equalsIgnoreCase(coach1)) {
					System.out.println("--------------------------------------------------------------------------------");

					System.out.println("Enter payment (900): ");
					int C_tic = scan.nextInt();
					System.out.println("--------------------------------------------------------------------------------");
					if (C_tic == C_AC_Sl) {
						System.out.println("Your ticket booked! Coimbatore Sleeper (AC)");
						System.out.println("Happy Journey!");
						System.out.println("Thank you for choosing us!");
						System.out.println("--------------------------------------------------------------------------------");
					} else {
						System.out.println("Warning!,Please enter correct payment!");
						System.out.println("--------------------------------------------------------------------------------");
					}
				}else if(chType .equalsIgnoreCase(coach2)) {
						System.out.println("Enter payment (750): ");
						int C_tic = scan.nextInt();
						System.out.println("--------------------------------------------------------------------------------");
						if (C_tic == C_AC_S) {
							System.out.println("Your ticket booked! Coimbatore Seater (AC)");
							System.out.println("Happy Journey!");
							System.out.println("Thank you for choosing us!");
							System.out.println("--------------------------------------------------------------------------------");
							
						} else {
							System.out.println("Warning!,Please enter correct payment!");
							System.out.println("--------------------------------------------------------------------------------");
							
						}
						
				}
				
			}else if(tic.equalsIgnoreCase(type2)) {
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("Choose your type(sleeper/seater): ");
				String chType = scan.next();
				if(chType .equalsIgnoreCase(coach1)) {
					System.out.println("Enter payment (700): ");
					int C_tic = scan.nextInt();
					System.out.println("--------------------------------------------------------------------------------");
					if (C_tic == C_NAC_Sl) {
						System.out.println("Your ticket booked! Coimbatore Sleeper (NAC)");
						System.out.println("Happy Journey!");
						System.out.println("Thank you for choosing us!");
						System.out.println("--------------------------------------------------------------------------------");
					} else {
						System.out.println("Warning!,Please enter correct payment!");
						System.out.println("--------------------------------------------------------------------------------");
					}
				}else if(chType .equalsIgnoreCase(coach2)) {
					System.out.println("--------------------------------------------------------------------------------");
						System.out.println("Enter payment (550): ");
						int C_tic = scan.nextInt();
						System.out.println("--------------------------------------------------------------------------------");
						if (C_tic == C_NAC_S) {
							System.out.println("Your ticket booked! Coimbatore Seater (NAC)");
							System.out.println("Happy Journey!");
							System.out.println("Thank you for choosing us!");
							System.out.println("--------------------------------------------------------------------------------");
						} else {
							System.out.println("Warning!,Please enter correct payment!");
							System.out.println("--------------------------------------------------------------------------------");
						}
				}

			}else {
				System.out.println("Error!,Incorrect crenditial");
				System.out.println("Please run the program!");
				System.out.println("--------------------------------------------------------------------------------");
			}
			

			break;
		case 2:
			System.out.println("Erode");
			int E_AC_Sl = 850;
			int E_AC_S = 700;
			int E_NAC_Sl = 600;
			int E_NAC_S = 450;
			System.out.println("Erode AC ticket: " + E_AC_Sl);
			System.out.println("Erode AC ticket: " + E_AC_S);
			System.out.println("Erode AC ticket: " + E_NAC_Sl);
			System.out.println("Erode NAC ticket: " + E_NAC_S);
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("Choose your ticket (AC/NAC):");
			
			String E_tic = scan.next();
			System.out.println("--------------------------------------------------------------------------------");
			if(E_tic .equalsIgnoreCase(type1)) {
				System.out.println("Choose your type(sleeper/seater): ");
				String chType = scan.next();
				if(chType .equalsIgnoreCase(coach1)) {
					System.out.println("--------------------------------------------------------------------------------");
					System.out.println("Enter payment (850): ");
					int E_pay_sl = scan.nextInt();
					System.out.println("--------------------------------------------------------------------------------");
					if (E_pay_sl == E_AC_Sl) {
						System.out.println("Your ticket booked! Erode Sleeper (AC)");
						System.out.println("Happy Journey!");
						System.out.println("Thank you for choosing us!");
						System.out.println("--------------------------------------------------------------------------------");
					} else {
						System.out.println("Warning!,Please enter correct payment!");
						System.out.println("--------------------------------------------------------------------------------");
					}
				}else if(chType .equalsIgnoreCase(coach2)) {
					System.out.println("--------------------------------------------------------------------------------");
						System.out.println("Enter payment (700): ");
						int E_pay_s = scan.nextInt();
						System.out.println("--------------------------------------------------------------------------------");

						if (E_pay_s == E_AC_S) {
							System.out.println("Your ticket booked! Erode Seater (AC)");
							System.out.println("Happy Journey!");
							System.out.println("Thank you for choosing us!");
							System.out.println("--------------------------------------------------------------------------------");
						} else {
							System.out.println("Warning!,Please enter correct payment!");
							System.out.println("--------------------------------------------------------------------------------");
						}
				}
				
			}else if(E_tic.equalsIgnoreCase(type2)) {
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("Choose your type(sleeper/seater): ");
				String chType = scan.next();
				System.out.println("--------------------------------------------------------------------------------");
				if(chType .equalsIgnoreCase(coach1)) {
					System.out.println("Enter payment (600): ");
					int E_tic_NAC = scan.nextInt();
					System.out.println("--------------------------------------------------------------------------------");
					if (E_tic_NAC == E_NAC_Sl) {
						System.out.println("Your ticket booked! Erode Sleeper (NAC)");
						System.out.println("Happy Journey!");
						System.out.println("Thank you for choosing us!");
						System.out.println("--------------------------------------------------------------------------------");
					} else {
						System.out.println("Warning!,Please enter correct payment!");
						System.out.println("--------------------------------------------------------------------------------");
					}
				}else if(chType .equalsIgnoreCase(coach2)) {
					System.out.println("--------------------------------------------------------------------------------");
						System.out.println("Enter payment (450): ");
						int E_tic_ = scan.nextInt();
						System.out.println("--------------------------------------------------------------------------------");
						if (E_tic_ == E_NAC_S) {
							System.out.println("Your ticket booked! Erode Seater (NAC)");
							System.out.println("Happy Journey!");
							System.out.println("Thank you for choosing us!");
							System.out.println("--------------------------------------------------------------------------------");
						} else {
							System.out.println("Warning!,Please enter correct payment!");
							System.out.println("--------------------------------------------------------------------------------");
						}
				}

			}else {
				System.out.println("Error!,Incorrect crenditial");
				System.out.println("Please run the program!");
				System.out.println("--------------------------------------------------------------------------------");
			}
			
			
			break;
		case 3:
			System.out.println("Salem");
			int S_AC_Sl = 700;
			int S_AC_S = 600;
			int S_NAC_Sl = 500;
			int S_NAC_S = 400;
			System.out.println("Salem AC ticket Sleeper: " + S_AC_Sl);
			System.out.println("Salem AC ticket Seater: "+S_AC_S);
			System.out.println("Salem NAC ticket Sleeper: " + S_NAC_Sl);
			System.out.println("Salem NAC ticket Seater: "+ S_NAC_S);
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("Choose your ticket (AC/NAC): ");
			
          String S_tic = scan.next();
			
			if(S_tic .equalsIgnoreCase(type1)) {
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("Choose your type(sleeper/seater): ");
				String chType = scan.next();
				if(chType .equalsIgnoreCase(coach1)) {
					System.out.println("--------------------------------------------------------------------------------");
					System.out.println("Enter payment (700): ");
					int S_pay_sl = scan.nextInt();
					System.out.println("--------------------------------------------------------------------------------");
					if (S_pay_sl == S_AC_Sl) {
						System.out.println("Your ticket booked! Salem Sleeper (AC)");
						System.out.println("Happy Journey!");
						System.out.println("Thank you for choosing us!");
						System.out.println("--------------------------------------------------------------------------------");
					} else {
						System.out.println("Warning!,Please enter correct payment!");
						System.out.println("--------------------------------------------------------------------------------");
					}
				}else if(chType .equalsIgnoreCase(coach2)) {
					System.out.println("--------------------------------------------------------------------------------");
						System.out.println("Enter payment (600): ");
						int S_pay_s = scan.nextInt();
						System.out.println("--------------------------------------------------------------------------------");
						if (S_pay_s == S_AC_S) {
							System.out.println("Your ticket booked! Salem Seater (AC)");
							System.out.println("Happy Journey!");
							System.out.println("Thank you for choosing us!");
							System.out.println("--------------------------------------------------------------------------------");
						} else {
							System.out.println("Warning!,Please enter correct payment!");
							System.out.println("--------------------------------------------------------------------------------");
						}
				}
				
			}else if(S_tic.equalsIgnoreCase(type2)) {
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("Choose your type(sleeper/seater): ");
				String chType = scan.next();
				System.out.println("--------------------------------------------------------------------------------");
				if(chType .equalsIgnoreCase(coach1)) {
					System.out.println("Enter payment (500): ");
					int S_tic_NAC = scan.nextInt();
					System.out.println("--------------------------------------------------------------------------------");
					if (S_tic_NAC == S_NAC_Sl) {
						System.out.println("Your ticket booked! Salem Sleeper (NAC)");
						System.out.println("Happy Journey!");
						System.out.println("Thank you for choosing us!");
						System.out.println("--------------------------------------------------------------------------------");
					} else {
						System.out.println("Warning!,Please enter correct payment!");
						System.out.println("--------------------------------------------------------------------------------");
					}
				}else if(chType .equalsIgnoreCase(coach2)) {
					System.out.println("--------------------------------------------------------------------------------");
						System.out.println("Enter payment (400): ");
						int S_tic_ = scan.nextInt();
						System.out.println("--------------------------------------------------------------------------------");
						if (S_tic_ == S_NAC_S) {
							System.out.println("Your ticket booked! Salem Seater (NAC)");
							System.out.println("Happy Journey!");
							System.out.println("Thank you for choosing us!");
							System.out.println("--------------------------------------------------------------------------------");

						} else {
							System.out.println("Warning!,Please enter correct payment!");
							System.out.println("--------------------------------------------------------------------------------");
						}
				}

			}else {
				System.out.println("Error!,Incorrect crenditial");
				System.out.println("Please run the program!");
				System.out.println("--------------------------------------------------------------------------------");
			}
			
			
			break;
		case 4:
			System.out.println("Vilupuram");
			int V_AC_Sl = 650;
			int V_AC_S = 550;
			int V_NAC_Sl = 450;
			int V_NAC_S = 350;
			System.out.println("Vilupuram AC ticket Sleeper: " + V_AC_Sl);
			System.out.println("Vilupuram AC ticket Seater: "+V_AC_S);
			System.out.println("Vilupuram NAC ticket Sleeper: "+V_NAC_Sl);
			System.out.println("Vilupuram NAC ticket Seater: " + V_NAC_S);
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("Choose your ticket (AC/NAC) ");
			
            String V_tic = scan.next();
    		System.out.println("--------------------------------------------------------------------------------");
			
			if(V_tic .equalsIgnoreCase(type1)) {
				System.out.println("Choose your type(sleeper/seater): ");
				String chType = scan.next();
				System.out.println("--------------------------------------------------------------------------------");
				if(chType .equalsIgnoreCase(coach1)) {
					System.out.println("Enter payment (650): ");
					int V_pay_sl = scan.nextInt();
					System.out.println("--------------------------------------------------------------------------------");
					if (V_pay_sl == V_AC_Sl) {
						System.out.println("Your ticket booked! Vilupuram Sleeper (AC)");
						System.out.println("Happy Journey!");
						System.out.println("Thank you for choosing us!");
						System.out.println("--------------------------------------------------------------------------------");
					} else {
						System.out.println("Warning!,Please enter correct payment!");
						System.out.println("--------------------------------------------------------------------------------");
					}
				}else if(chType .equalsIgnoreCase(coach2)) {
					System.out.println("--------------------------------------------------------------------------------");
						System.out.println("Enter payment (550): ");
						int V_pay_s = scan.nextInt();
						System.out.println("--------------------------------------------------------------------------------");
						if (V_pay_s == V_AC_S) {
							System.out.println("Your ticket booked! Vilupuram Seater (AC)");
							System.out.println("Happy Journey!");
							System.out.println("Thank you for choosing us!");
							System.out.println("--------------------------------------------------------------------------------");
						} else {
							System.out.println("Warning!,Please enter correct payment!");
							System.out.println("--------------------------------------------------------------------------------");
						}
				}
				
			}else if(V_tic.equalsIgnoreCase(type2)) {
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("Choose your type(sleeper/seater): ");
				String chType = scan.next();
				System.out.println("--------------------------------------------------------------------------------");
				if(chType .equalsIgnoreCase(coach1)) {
					System.out.println("Enter payment (450): ");
					int V_tic_NAC = scan.nextInt();
					System.out.println("--------------------------------------------------------------------------------");
					if (V_tic_NAC == V_NAC_Sl) {
						System.out.println("Your ticket booked! Vilupuram Sleeper (NAC)");
						System.out.println("Happy Journey!");
						System.out.println("Thank you for choosing us!");
						System.out.println("--------------------------------------------------------------------------------");
					} else {
						System.out.println("Warning!,Please enter correct payment!");
						System.out.println("--------------------------------------------------------------------------------");
					}
				}else if(chType .equalsIgnoreCase(coach2)) {
						System.out.println("Enter payment (350): ");
						int V_tic_ = scan.nextInt();
						System.out.println("--------------------------------------------------------------------------------");
						if (V_tic_ == V_NAC_S) {
							System.out.println("Your ticket booked! Vilupuram Seater (NAC)");
							System.out.println("Happy Journey!");
							System.out.println("Thank you for choosing us!");
							System.out.println("--------------------------------------------------------------------------------");
						} else {
							System.out.println("Warning!,Please enter correct payment!");
							System.out.println("--------------------------------------------------------------------------------");

						}
				}

			}else {
				System.out.println("Error!,Incorrect crenditial");
				System.out.println("Please run the program!");
				System.out.println("--------------------------------------------------------------------------------");
			}
			
			
			break;
		case 5:
			System.out.println("Chengalpattu");
			int Cp_AC_Sl = 700;
			int Cp_AC_S = 600;
			int Cp_NAC_Sl = 500;
			int Cp_NAC_S = 450;
			System.out.println("Chengalpattu AC ticket Sleeper: " + Cp_AC_Sl);
			System.out.println("Chengalpattu AC ticket Seater: "+Cp_AC_S);
			System.out.println("Chengalpattu NAC ticket Sleeper: "+Cp_NAC_Sl);
			System.out.println("Chengalpattu NAC ticket Seater: " + Cp_NAC_S);
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("Choose your ticket (AC/NAC): ");
            
			String Cp_tic = scan.next();
			System.out.println("--------------------------------------------------------------------------------");
			
			if(Cp_tic .equalsIgnoreCase(type1)) {
				System.out.println("Choose your type(sleeper/seater): ");
				String chType = scan.next();
				System.out.println("--------------------------------------------------------------------------------");
				
				if(chType .equalsIgnoreCase(coach1)) {
					System.out.println("Enter payment (700): ");
					int Cp_pay_sl = scan.nextInt();
					System.out.println("--------------------------------------------------------------------------------");

					if (Cp_pay_sl == Cp_AC_Sl) {
						System.out.println("Your ticket booked! Chengalpattu Sleeper (AC)");
						System.out.println("Happy Journey!");
						System.out.println("Thank you for choosing us!");
						System.out.println("--------------------------------------------------------------------------------");
					} else {
						System.out.println("Warning!,Please enter correct payment!");
						System.out.println("--------------------------------------------------------------------------------");
					}
				}else if(chType .equalsIgnoreCase(coach2)) {
						System.out.println("Enter payment (600): ");
						int Cp_pay_s = scan.nextInt();
						System.out.println("--------------------------------------------------------------------------------");
						if (Cp_pay_s == Cp_AC_S) {
							System.out.println("Your ticket booked! Chengalpattu Seater (AC)");
							System.out.println("Happy Journey!");
							System.out.println("Thank you for choosing us!");
							System.out.println("--------------------------------------------------------------------------------");
						} else {
							System.out.println("Warning!,Please enter correct payment!");
							System.out.println("--------------------------------------------------------------------------------");
						}
				}
				
			}else if(Cp_tic.equalsIgnoreCase(type2)) {
				System.out.println("Choose your type(sleeper/seater): ");
				String chType = scan.next();
				System.out.println("--------------------------------------------------------------------------------");

				if(chType .equalsIgnoreCase(coach1)) {
					System.out.println("Enter payment (500): ");
					int Cp_tic_NAC = scan.nextInt();
					System.out.println("--------------------------------------------------------------------------------");
					if (Cp_tic_NAC == Cp_NAC_Sl) {
						System.out.println("Your ticket booked! Chengalpattu Sleeper (NAC)");
						System.out.println("Happy Journey!");
						System.out.println("Thank you for choosing us!");
						System.out.println("--------------------------------------------------------------------------------");
					} else {
						System.out.println("Warning!,Please enter correct payment!");
						System.out.println("--------------------------------------------------------------------------------");
					}
				}else if(chType .equalsIgnoreCase(coach2)) {
						System.out.println("Enter payment (450): ");
						int Cp_tic_ = scan.nextInt();
						System.out.println("--------------------------------------------------------------------------------");

						if (Cp_tic_ == Cp_NAC_S) {
							System.out.println("Your ticket booked! Chengalpattu Seater (NAC)");
							System.out.println("Happy Journey!");
							System.out.println("Thank you for choosing us!");
							System.out.println("--------------------------------------------------------------------------------");

						} else {
							System.out.println("Warning!,Please enter correct payment!");
							System.out.println("--------------------------------------------------------------------------------");

						}
				}

			}else {
				System.out.println("Error!,Incorrect crenditial");
				System.out.println("Please run the program!");
				System.out.println("--------------------------------------------------------------------------------");
			}
			
			
			break;
		case 6:
			System.out.println("Chennai");
			int Ch_AC_Sl = 900;
			int Ch_AC_S = 800;
			int Ch_NAC_Sl = 750;
			int Ch_NAC_S = 600;
			System.out.println("Chennai AC ticket Sleeper: " + Ch_AC_Sl);
			System.out.println("Chennai AC ticket Seater: "+ Ch_AC_S);
			System.out.println("Chennai AC ticket Sleeper: "+Ch_NAC_Sl);
			System.out.println("Chennai NAC ticket Seater: " + Ch_NAC_S);
			
			System.out.println("--------------------------------------------------------------------------------");

			
			System.out.println("Choose your ticket (AC/NAC): ");
         
			String Ch_tic = scan.next();
			System.out.println("--------------------------------------------------------------------------------");
			
			if(Ch_tic .equalsIgnoreCase(type1)) {
				System.out.println("Choose your type(sleeper/seater): ");
				String chType = scan.next();
				System.out.println("--------------------------------------------------------------------------------");
				if(chType .equalsIgnoreCase(coach1)) {
					System.out.println("Enter payment (900): ");
					int Ch_pay_sl = scan.nextInt();
					System.out.println("--------------------------------------------------------------------------------");
					if (Ch_pay_sl == Ch_AC_Sl) {
						System.out.println("Your ticket booked! Chennai Sleeper (AC)");
						System.out.println("Happy Journey!");
						System.out.println("Thank you for choosing us!");
						System.out.println("--------------------------------------------------------------------------------");

					} else {
						System.out.println("Warning!,Please enter correct payment!");
						System.out.println("--------------------------------------------------------------------------------");
					}
				}else if(chType .equalsIgnoreCase(coach2)) {
						System.out.println("Enter payment (800): ");
						int Ch_pay_s = scan.nextInt();
						System.out.println("--------------------------------------------------------------------------------");
						if (Ch_pay_s == Ch_AC_S) {
							System.out.println("Your ticket booked! Chennai Seater (AC)");
							System.out.println("Happy Journey!");
							System.out.println("Thank you for choosing us!");
							System.out.println("--------------------------------------------------------------------------------");
							
						} else {
							System.out.println("Warning!,Please enter correct payment!");
							System.out.println("--------------------------------------------------------------------------------");
							
						}
				}
				
			}else if(Ch_tic.equalsIgnoreCase(type2)) {
				System.out.println("Choose your type(sleeper/seater): ");
				String chType = scan.next();
				System.out.println("--------------------------------------------------------------------------------");
				if(chType .equalsIgnoreCase(coach1)) {
					System.out.println("Enter payment (750): ");
					int Ch_tic_NAC = scan.nextInt();
					System.out.println("--------------------------------------------------------------------------------");
					if (Ch_tic_NAC == Ch_NAC_Sl) {
						System.out.println("Your ticket booked! Chennai Sleeper (NAC)");
						System.out.println("Happy Journey!");
						System.out.println("Thank you for choosing us!");
						System.out.println("--------------------------------------------------------------------------------");

					} else {
						System.out.println("Warning!,Please enter correct payment!");
						System.out.println("--------------------------------------------------------------------------------");
					}
				}else if(chType .equalsIgnoreCase(coach2)) {
						System.out.println("Enter payment (600): ");
						int Ch_tic_ = scan.nextInt();
						System.out.println("--------------------------------------------------------------------------------");
						if (Ch_tic_ == Ch_NAC_S) {
							System.out.println("Your ticket booked! Chennai Seater (NAC)");
							System.out.println("Happy Journey!");
							System.out.println("Thank you for choosing us!");
							System.out.println("--------------------------------------------------------------------------------");
						} else {
							System.out.println("Warning!,Please enter correct payment!");
							System.out.println("--------------------------------------------------------------------------------");
						}
				}

			}else {
				System.out.println("Error!,Incorrect crenditial");
				System.out.println("Please run the program!");
				System.out.println("--------------------------------------------------------------------------------");
				
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

}
