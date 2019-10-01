
public class Solution {
	

	static boolean palindrome(String s) {
		// TODO
		//System.out.println("test: "+s.length());
		if(s.length()<=1)//aptur rekursiju, ja varda garums ir parak mazs
			return true;
		else
			if(s.toLowerCase().substring(0, 1).equals(s.toLowerCase().substring(s.length()-1)))//parbauda pirmo simbolu ar pedejo ignorejot Case
				return palindrome(s.substring(1, s.length()-1));//nodod rekursijai vardu, nonemot pirmo un pedejo simbolu
			else
				return false;//aptur rekursiju, ja vards nav palindroms
	}
	
	static long superDigit(long x) {
		// TODO
		if(x/10!=0)//stop rekursiju, ja nevar izdalit ar 10
		return x%10 + superDigit(x/10);//nodod rekursijai skaitli nonemot pedejo ciparu
		else return x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(palindrome("abcba")); //true
		System.out.println(palindrome("Sapalsarîtadçdatîraslapas")); //true
		System.out.println(palindrome("stirna")); //false
		System.out.println(superDigit(9875)); //29
		System.out.println(superDigit(2)); //2
	}

}
