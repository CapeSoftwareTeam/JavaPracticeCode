import java.util.ArrayList;
import java.util.Collections;

public class ArraylistPractice {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(9);
		num.add(10);
		num.add(4);
		num.add(6);
		num.add(3);
		num.add(5);
		num.add(2);
		num.add(7);
		num.add(8);
		num.add(1);
		
		Collections.sort(num);
		
		for(int i = 0;i<num.size();i++) {
			System.out.print(" "+ num.get(i));
		}
	}

}
