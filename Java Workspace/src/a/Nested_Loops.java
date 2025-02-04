package a;
import java.util.Scanner;
public class Nested_Loops {

	public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
 int rows;
 int columns;
 String symbol = "";
System.out.println("Enter no. of Rows: ");
rows = scan.nextInt();
System.out.println("Enter no. of Columns: ");
columns = scan.nextInt();
System.out.println("Enter the Symbol: ");
symbol = scan.next();
for(int i = 1;i<=rows;i++) {
	System.out.println();
	for(int j = 1;j<=columns;j++) {
		System.out.print(symbol);
	}
}
scan.close();
	}

}
