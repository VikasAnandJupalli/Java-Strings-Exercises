package a;

public class Two_D_Arrays {
public static void main(String[] args) {
	/*String[][] name = new String[2][3];
	name[0][0] = "Vikas";
	name[0][1] = "Vicky";
	name[0][2] = "Anand";
	name[1][0] = "Vijay";
	name[1][1] = "Rupa";
	name[1][2] = "Vero";*/
	String[][] name = {{"Vikas","Vicky","Anand"},{"Vijay","Rupa","Vero"}};
	for(int i = 0;i<name.length;i++) {
		System.out.println();
		for(int j = 0;j<name[i].length;j++) {
			System.out.print(name[i][j]+" ");
		}
	}
}
}
