
public class Overloading {
	public void myMethod(int a,int b) {
		System.out.println("Sum of a + b:"+ (a + b));
	}
	
	public void myMethod(String name) {
		System.out.println("Hi, "+name +" welcome to application");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading obj = new Overloading();
	    obj.myMethod("Gokul");
	    obj.myMethod(5, 5);
	}

}
