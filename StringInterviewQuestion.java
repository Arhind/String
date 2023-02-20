package string;

public class StringInterviewQuestion {

	public static void main(String[] args) {
		
		String str1 = "Microsoft";
		String str2 = "Google";
		
		str1 = str1 + str1;
		System.out.println(str1);
		
		str2 = str2.concat(str2);
		System.out.println(str2);
		
		String s1 = "Hello";
		String s2 = "Hello";
	
		if(s1 == s2)
			System.out.println(s1==s2);
		
		if(s1.equals(s2))
			System.out.println(s1.equals(s2));
	}
}