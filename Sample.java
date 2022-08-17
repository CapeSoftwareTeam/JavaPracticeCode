
public class Sample {

	static int i = 6;
	int j = 8;

	public static void main(String[] args) {

		Sample obj = new Sample();
		Sample obj1 = new Sample();
      //  Sample obj2 = new Sample();
		obj.i = obj.i;
		obj.j = obj.j;
		i++;
		obj.j++;
		System.out.println("First obj" + obj.i +","+obj.j);
		obj1.i = obj1.i;
		obj1.j = obj1.j;
		System.out.println("Obj two" + obj1.i+","+obj1.j);
		i++;
		//obj2.i = obj.i;
		//obj2.j = obj.i;
	//	System.out.println("Obj two" + obj2.i+","+obj2.j);
	}

}
