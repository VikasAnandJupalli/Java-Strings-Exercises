package a;
import java.util.ArrayList;
public class Array_Lists {

	public static void main(String[] args) {
ArrayList <String> a = new ArrayList<String>();
    a.add("Vikas!");
    a.add("Vero!");
    a.set(0, "Vijay!");
    //a.clear();
    a.remove(1);
    for(int i = 0;i<a.size();i++) {
    	System.out.println(a.get(i));
    }

	}

}
