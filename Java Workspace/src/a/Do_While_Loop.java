package a;

import java.util.Scanner;

public class Do_While_Loop {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String name;
	do{
		System.out.print("Enter your name: ");
		name = scan.nextLine();
	}while(name.isEmpty());
	System.out.println("Hello "+name+"!");
scan.close();
}
}
