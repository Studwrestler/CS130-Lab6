package lab6;
import java.util.Scanner;
public class SquareCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enther the length: ");
		int l = scan.nextInt();
		System.out.println("Enther the width");
		int w = scan.nextInt();
		if(l==w)
		{
			System.out.println("The object is a square");
		}
		else
		{
			System.out.println("The object is not a square");
		}

	}

}
