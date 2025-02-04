package a;
import java.util.ArrayList;
public class For_Each_Loop {

	public static void main(String[] args) {
//		String[] Drinks = {"Cola","Fanta","Pepsi","Sprite"};
ArrayList<String> Drinks = new ArrayList<String>();
Drinks.add("Cola");
Drinks.add("Fanta");
Drinks.add("Pepsi");
Drinks.add("Sprite");
for(String i : Drinks) {
	System.out.println(i);
}
	}

}
