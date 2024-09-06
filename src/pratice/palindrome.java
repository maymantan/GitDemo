package pratice;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		palindrome pal = new palindrome();
		System.out.println(pal.strPalindrome("manishhsinam"));
		System.out.println(pal.numbPalindrome(124521));
		
	}
	
	public boolean numbPalindrome(int num) {
		int a,b=0;
		int temp = num;
		//System.out.println(Integer.toString(num).length());
		while(temp>0) {
			
			a=temp%10;
			temp = temp/10;
			b = (b*10)+a;
		}
		
		if(b==num) {
			return true;
		}
		else {
			return false;
		}
		
		
		
	}
	
	public boolean strPalindrome(String s) {
		String [] newS = s.split("");
		String newString="";
		for(int i = newS.length-1;i>=0;i--) {
			newString=newString+newS[i];
		}
		
		if(s.equals(newString)) {
			return true;
		}
		else {
			return false;
		}
	}

}
