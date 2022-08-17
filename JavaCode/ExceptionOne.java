
public class ExceptionOne {

	public static void main(String[] args) {
		
		try {
//			int a[] = new int[5];
//			for(int i = 0;i<a.length;i++) {
//				a[i]=i;
			String s =null;
			System.out.println(s.length());
			
			//System.out.println("Print a[6]: "+ a[1]);
		} catch(ArithmeticException e){
			System.out.println("ArithmeticException Occurs!");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException Occurs!");
		}
		catch(Exception e){
		System.out.println("Unknown Exception Occurs!");	
		}
		System.out.println(" Rest of the code runs successfully!");
		
	}
}
