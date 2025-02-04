package a;

public class Overloaded_Methods {

	public static void main(String[] args) {
System.out.println(add(1,2,3,4));
System.out.println(add(1.2,2.5,3.1,4.7));
	}
	static int add(int a,int b) {
System.out.println("This is overloaded Method #1.");
return a+b; }
	static int add(int a,int b,int c) {
		System.out.println("This is overloaded Method #2.");
		return a+b+c; }
	static int add(int a,int b,int c,int d) {
		System.out.println("This is overloaded Method #3.");
		return a+b+c+d; }
	static double add(double a,double b) {
		System.out.println("This is overloaded Method #4.");
		return a+b; }
	static double add(double a,double b,double c) {
		System.out.println("This is overloaded Method #5.");
		return a+b+c; }
	static double add(double a,double b,double c,double d) {
		System.out.println("This is overloaded Method #6.");
		return a+b+c+d; }
}