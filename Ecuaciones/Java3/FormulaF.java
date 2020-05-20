package Java3;

import javax.swing.JOptionPane;

public class FormulaF {

	public static void main(String[] args) {
		
		double  x = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de x"));
		
		int numero1 = 7;
		int numero2 = 5;
		int numero3 = 3;
		int numero4 = 4;
		
		double f = numero1*(Math.cos(Math.sqrt(numero2 -(Math.sin(Math.sqrt((numero3 * x) - numero4))))));
		
		
		System.out.println("Resultado de la ecuacion: " + f);

	}

}
