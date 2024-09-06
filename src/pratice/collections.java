package pratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class collections {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Manish");
		a.add("Tanu");
		a.add("Mayank");
		
		System.out.println(a.get(1));
		
		for(int i = 0; i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		for(String i : a) {
			System.out.println(i);
		}
		String[] arr = {"Man"};
		System.out.println(arr[0]);
		
		System.out.println(a.contains("Manish"));
		
		List<String> arrList=Arrays.asList(arr);
		//above code will create list of fixed sized so we cannot add or remove any element
		System.out.println("************************String************************");
		
		
		//2 string object with same memeory
		String s= "Manish";
		String s1= "Manish";
		System.out.println(s+" "+s1);
		
		
		
	}

}
