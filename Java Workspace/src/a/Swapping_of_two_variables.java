package a;

public class Swapping_of_two_variables {

	public static void main(String[] args) {
    String x = "Vikas";
    String y = "Vijay";
    System.out.println("Before Swapping X: "+x);
    System.out.println("Before Swapping Y: "+y);
    String temp;
    temp=x;
    x=y;
    y=temp;
    System.out.println("After Swapping X: "+x);
    System.out.println("After Swapping Y: "+y);
	}

}
