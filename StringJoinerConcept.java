package string;

import java.util.StringJoiner;

public class StringJoinerConcept {

	public static void main(String[] args) {

		String s = "ABCDEFghijkl1234567890";
		digitThenChar(s);
	}
	static void digitThenChar(String s)
	{
		StringBuffer buffer = new StringBuffer();
		StringBuilder builder = new StringBuilder();
		System.out.println("Print all numbers first then characters");
		for( int i=0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			int a = (int) c;
			if( a>=48 && a<=57 )
			{
				buffer = buffer.append(c);
			}
			else
			{
				builder = builder.append(c);
			}
		}
		
		StringJoiner join = new StringJoiner(",","[","]");
		join.add(buffer).add(builder);
		System.out.println(buffer);
		System.out.println(builder);
		System.out.println("Final String : "+join);
	}
}
