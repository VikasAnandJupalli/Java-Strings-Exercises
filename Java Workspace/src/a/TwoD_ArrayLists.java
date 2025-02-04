package a;
import java.util.*;
public class TwoD_ArrayLists {
public static void main(String[] args){
	ArrayList<ArrayList<String>> SuperMarket = new ArrayList<ArrayList<String>>();
	ArrayList<String> Food = new ArrayList<String>();
	Food.add("Lays");
	Food.add("Bingo");
	Food.add("Kurukure");
	ArrayList<String> Vegetables = new ArrayList<String>();
	Vegetables.add("Carrot");
	Vegetables.add("Cucumber");
	Vegetables.add("Tomato");
	ArrayList<String> Fruits = new ArrayList<String>();
	Fruits.add("Apple");
	Fruits.add("Banana");
	Fruits.add("Grapes");
	SuperMarket.add(Food);
	SuperMarket.add(Vegetables);
	SuperMarket.add(Fruits);
	for(int i = 0;i<SuperMarket.size();i++) {
		for (int j = 0;j<SuperMarket.size();j++) {
	System.out.println(SuperMarket.get(i).get(j));}}
}
}
