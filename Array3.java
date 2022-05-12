package array;

import java.util.ArrayList;

public class Array3 {

	public static void main(String[] args) {
		ArrayList<Double> rocky = new ArrayList<>();
		double s = 11.24;
		rocky.add(s);
		System.out.println("add first:"+rocky);
		double f = 24.11;
		rocky.add(f);
		System.out.println("add next one:"+rocky);
		double a = 19.24;
		rocky.add(a);
		System.out.println("add next two:"+rocky);
		rocky.remove(Double.valueOf(a));
		System.out.println("remove last"+rocky);
		rocky.remove(Double.valueOf(f));
		System.out.println("remove second"+rocky);

	}

}
