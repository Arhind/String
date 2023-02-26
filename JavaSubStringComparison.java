// https://www.hackerrank.com/challenges/java-string-compare/problem?h_r=next-challenge&h_v=zen

// Input : Helloworld
// Output : lowo
package string;
import java.util.Scanner;

public class JavaSubStringComparison {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		System.out.println(str.substring(start,end));
		sc.close();
	}
}