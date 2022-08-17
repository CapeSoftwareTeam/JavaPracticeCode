import java.util.HashSet;
public class Setpractice {

	public static void main(String[] args) {
		HashSet<Integer> num = new HashSet<Integer>();
		num.add(5);
		num.add(7);
		num.add(4);
		num.add(8);
		num.add(3);
		num.add(3);
		num.add(9);
		
			
		for(int i = 1;i<=10;i++) {
			if(num.contains(i)) {
				System.out.println("We found the number :" +i);
			}else {
				System.out.println("We haven't found the number");
			}
		}
	}

}
