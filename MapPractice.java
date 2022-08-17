import java.util.HashMap;
public class MapPractice {

	public static void main(String[] args) {
       HashMap<Integer,String> car = new HashMap<Integer,String>();
       car.put(1,"VW");
       car.put(2,"MG");
       car.put(3,"XUV700");
       car.put(4,"TATA");
       
       for(int i = 1;i<=4;i++) {
    	   System.out.println(car.get(i));
       }
       
	}
}
