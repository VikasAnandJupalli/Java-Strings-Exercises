package a;

public class printf {

	public static void main(String[] args) {
int a = 18;
double b = -1000.10;
char c = '!';
String d = "Welcome";
boolean e = true;
//System.out.printf("%-20d\n",a);
//System.out.printf("%.2f\n",b);
//System.out.printf("%020f\n",b);
//System.out.printf("%+f\n",b);
System.out.printf("%,f\n",b);
System.out.printf("%c\n",c);
System.out.printf("%s\n",d);
System.out.printf("%b\n",e);
	}

}
