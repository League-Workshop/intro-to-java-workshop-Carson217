package section3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String s = JOptionPane.showInputDialog("Hello. What is your name?");
	System.out.println("Grettings, " + s);
}
}
