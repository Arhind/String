package string;

import java.util.StringJoiner;

public class Join {

	public static void main(String[] args) {

		String[] str = {"USA", "Japan", "France", "Germany", "Italy", "India", "Canada"};
		StringJoiner join = new StringJoiner(", ");
		
		for( int i=0; i<str.length; i++)
		{
			str[i] = str[i].toUpperCase();
			join.add(str[i]);
		}
		
		System.out.print(join);
	}

}
