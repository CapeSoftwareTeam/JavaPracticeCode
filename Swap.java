
public class Swap {

	public static void main(String[] args) {
		int x = 8;
		int y = 9;
		
		System.out.println("Before swap: "+"x = "+x +" "+"y = "+y);
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("After swap: "+"x = "+x +" "+"y = "+y);


	}

}
