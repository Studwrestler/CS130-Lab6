package lab6;
import java.util.Scanner;
public class WordLength {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = scan.nextLine();
		int length = word.length();
		if(length%2!=0)
		{
			System.out.println("The word length is odd");
		}
		else
		{
			System.out.println("The word length is even");
		}

	}

}
