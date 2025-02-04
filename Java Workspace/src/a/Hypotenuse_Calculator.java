package a;
import java.util.Scanner;
public class Hypotenuse_Calculator {

	public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
 System.out.println("Enter the side x: ");
 double x = scan.nextDouble();
 System.out.println("Enter the side y: ");
 double y = scan.nextDouble();
 double z = Math.sqrt((x*x)+(y*y));
 System.out.println("The side z is: "+z);
scan.close();
	}

}
