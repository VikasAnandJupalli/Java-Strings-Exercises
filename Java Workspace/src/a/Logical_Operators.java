package a;
import java.util.Scanner;
public class Logical_Operators {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	/*System.out.println("Enter the Temperature: ");
	int temp = scan.nextInt();
	if(temp>=40) {
		System.out.println("It's hot outside!");
	}
	else if(temp>=25 && temp<=35) {
		System.out.println("It's warm outside");
	}
	else {
		System.out.println("It's cold outside!");
	}*/
	System.out.println("Enter y or Y to continue");
	String response = scan.next();
	if(response.equals("y")||response.equals("Y")) {
		System.out.println("Ok!");
	}
	else {
		System.out.println("Good Bye!");
	}
	scan.close();
}
}
