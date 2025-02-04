package a;

import java.util.Scanner;

public class While_Loop {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String name = "";
	while(name.isEmpty()) {
		System.out.print("Enter your name: ");
		name = scan.nextLine();
	}
	System.out.println("Hello "+name+"!");
scan.close();
}
}
