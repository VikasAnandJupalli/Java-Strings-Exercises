package a;
import java.util.Scanner;
public class User_Input {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("What is your name? ");
	String name = scan.nextLine();
	System.out.println("What is your age? ");
	int age = scan.nextInt();
	scan.nextLine();
	System.out.println("What is your Favourite Movie? ");
	String movie = scan.nextLine();
	System.out.println("Hello "+name+"!");
	System.out.println("Your are "+age+" Years old!");
	System.out.println("You're favourite movie is: "+movie);
	scan.close();
}
}