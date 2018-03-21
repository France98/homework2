package homework;

import java.util.ArrayList;
import java.util.List;

public class Recursion {
	public static List unique(List list) {
		if (list.size() == 1) {
			return list;
		}
		List get = list.subList(1, list.size());
		if (list.get(0) != null) {
			if (list.get(0).equals(list.get(1))) {
				get.remove(0);
				unique(list);
			} else {
				unique(get);
			}
		}
		return list;
	}
	

	public static long fibonacci(int n) {
		if(n == 2){
			return 1;
		}
		return helper(0,1,n);
	}
	
	public static long helper(long x , long y ,int n){
		if(n <= 0) return x;
		else{
			return helper(y, x+y ,n-1);
		}
	}

	public static void main(String[] args) {
		// List<String> string = new ArrayList<>();
		// string.add("a");
		// string.add("b");
		// string.add("b");
		// string.add("b");
		// string.add("c");
		// string.add("b");
		// string.add("c");
		// string.add("c");
		// System.out.println(unique(string));
		System.out.println(fibonacci(92));
	}
}
