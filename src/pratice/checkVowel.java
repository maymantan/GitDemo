package pratice;

public class checkVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "aeiou";
		name=name.toLowerCase();
		String [] name1=name.split("");
		
		String [] vowel = {"a","e","i","o","u"};
		
		for(String v:vowel) {
			for(int i=0;i<=name1.length-1;i++) {
				if(v.equals(name1[i])) {
					System.out.println(v);
				}
			}
		}
	}

}
