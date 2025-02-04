package a;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;
public class Experiments{
	       public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.println("What is the res: ");
String res = scan.next();
if(res.equals("Y")||res.equals("y")) {
	System.out.println("ok");}
	else {
		System.out.println("bye");
	}
}
}
