
public class Bike extends Vehicle {
	public void speed() {
		System.out.println("Bike is running very fast!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Vehicle obj = new Vehicle();
      Vehicle ob = new Bike();
      
      ob.speed();
     
	}
}
