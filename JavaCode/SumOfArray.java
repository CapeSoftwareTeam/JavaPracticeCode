
public class SumOfArray {

	public static void main(String[] args) {
		int arr[] = {20,40,87,56,39,72,89,96,21,10};
		int sum = 0;
		int avg;
		System.out.println("Length of array: "+ arr.length);
		for(int i =0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum of array: "+sum );
		
		avg = sum/arr.length;
		
	}

}
