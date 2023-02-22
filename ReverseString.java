/* Palindrome String
 * https://www.hackerrank.com/challenges/java-string-reverse/problem 
 * 
 * Input
 * madam
 * 
 * Output
 * Yes
 */

package string;
import java.util.*;

public class ReverseString {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String str="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			str = str+s.charAt(i);
		}
		
		if( s.equals(str) )
			System.out.println("Yes");
		else
			System.out.println("No");
		
		sc.close();
	}
}