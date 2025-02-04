package a;
import javax.swing.JOptionPane;
public class Hypotenuse_Calculator_GUI {
	public static void main(String[] args) {
double x = Double.parseDouble(JOptionPane.showInputDialog("Enter the side x: "));
double y = Double.parseDouble(JOptionPane.showInputDialog("Enter the side y: "));
double z = Math.sqrt((x*x)+(y*y));
JOptionPane.showMessageDialog(null, "The side z is: "+z);
	}
}
