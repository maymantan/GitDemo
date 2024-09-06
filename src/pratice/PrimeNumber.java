package pratice;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 11;
		int count=0;
		for(int i = 1 ; i<=(num/2);i++) {
			if(num%i==0) {
				count=count+1;
			}
		}
		
		System.out.println(count);
		if(count>1) {
			System.out.println("Non Prime");
		}
		else {
			System.out.println("Prime");
		}

		
	}

}
