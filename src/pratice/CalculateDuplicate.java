package pratice;

import java.lang.reflect.Array;

public class CalculateDuplicate {

	public static void main(String[] args) {
    
		
		String name = "manishtamrakarmayanktamrakar";
		String [] name1= name.split("");
	//	String [] newName = new String[name1.length];
		
		for(int i = 0;i<name1.length;i++) {
			int	count=1;
			for(int j =i+1;j<name1.length;j++) {
				if(name1[i].equals(name1[j])) {
					count++;
					name1[j]="0";
				}
			}
			if(count>1 && name1[i]!="0") {
				System.out.println(name1[i]+":"+count);
				}
			
		}
	}
	
	
}  
