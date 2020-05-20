package Java3;

import javax.swing.JOptionPane;

public class FormalE {

	public static void main(String[] args) {
		
		
		double  x = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de x"));
		
		double  y = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de y"));
		
		double numero1 = 1;
		double numero2 = 2;
		
		double e = (numero1 / (y - (numero1 / (x - (Math.pow(numero2, y))))));
		
		System.out.println("Resultado de la ecuacion: " + e);
		
		

	}

}
