package string;

public class StringTraversal_Insertion {

	public static void main(String[] args) {

		String s = "Its Simple";
		
		for(int i=0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			System.out.print(c+" "+(int)c+"\n");
		}
		for( int i=0; i<s.length(); i++)
		{
			char c = s.charAt(i);
		if(Character.isUpperCase(c))
			System.out.print(c+" "+(int)c+"\n");
	}}

}
