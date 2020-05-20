package Java3;

import javax.swing.JOptionPane;

public class AreaTriangulo {

	public static void main(String[] args) {
		
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite la altura del triangulo"));
		double base = Double.parseDouble(JOptionPane.showInputDialog("Digite la base del triangulo"));
		
		double area;
		
		area = ((base*altura)/2);
		
		System.out.println("El area del triangulo es: " + area);
		

	}

}
