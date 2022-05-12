package array;

import java.util.ArrayList;

public class Array2 {

	public static void main(String[] args) {
		ArrayList<Integer> rahman = new ArrayList<>();
		int s = 11;
		rahman.add(s);
		System.out.println("add first:"+rahman);
		int f = 24;
		rahman.add(f);
		System.out.println("add next one:"+rahman);
		int a = 19;
		rahman.add(a);
		System.out.println("add next two:"+rahman);
		rahman.remove(Integer.valueOf(a));
		System.out.println("remove last"+rahman);
		rahman.remove(Integer.valueOf(f));
		System.out.println("remove second"+rahman);
		
		
	}
}
