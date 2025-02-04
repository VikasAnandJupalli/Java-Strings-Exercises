package a;

public class Java_Methods {

	public static void main(String[] args) {
String a = "Hello";
int x = 2;
int y = 3;
hello(a);
System.out.println(add(x,y));
	}
	static void hello(String a) {
		System.out.println(a+"!");
	}
static int add(int x, int y) {
	return x+y;
}
}
