package lab6;
import java.util.Scanner;
public class NumberSwap {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n1 = scan.nextInt();
		System.out.println("Enter a 2nd number: ");
		int n2 = scan.nextInt();
		System.out.println("Before swapping "+n1+" "+n2);
		int temp = n1;
		n1 = n2;
		n2 =temp;
		System.out.println("After swapping "+n1+" "+n2);

	}

}
