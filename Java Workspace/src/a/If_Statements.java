package a;
import java.util.Scanner;
public class If_Statements {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Enter a number: ");
int a = scan.nextInt();
if(a>=100) {
	System.out.println("You are Immortal!");
}
else if(a>=18) {
	System.out.println("You are an adult!");
}
else if(a<18 && a>=13) {
	System.out.println("You are a teenager!");
}
else if(a<0) {
	System.out.println("You haven't been born yet!");
}
else {
	System.out.println("You are still a kid!");
}
scan.close();
	}

}
