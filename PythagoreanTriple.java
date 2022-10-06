package lab6;
import java.util.Scanner;
public class PythagoreanTriple {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of side a: ");
		int a =scan.nextInt();
		System.out.println("Enter the length of side b: ");
		int b =scan.nextInt();
		System.out.println("Enter the length of side c: ");
		int c =scan.nextInt();
		if(Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2))
		{
			System.out.println("A triangle with side a of "+ a+", side b of "+ b+ ", and side c of "+c+" is a right triangle");
		}
		else
		{
			System.out.println("A triangle with side a of "+ a+", side b of "+ b+ ", and side c of "+c+" is a not right triangle");
		}

	}

}
