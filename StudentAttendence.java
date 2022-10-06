package lab6;
import java.util.Scanner;
import java.text.NumberFormat;
public class StudentAttendence {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount of classes held:");
		double h = scan.nextDouble();
		System.out.println("Enter amount of classes attened:");
		double a = scan.nextDouble();
		NumberFormat i = NumberFormat.getPercentInstance();
		double p = (a/h);
		if(p>=0.75) 
		{
			System.out.println("Since "+ i.format(p)+" is greater or equal to 75%. They will be allowed to attend class");
		}
		else
		{
			System.out.println("Since "+ i.format(p)+" is less than 75%. They will not be allowed to attend class");
		}
		

	}

}
