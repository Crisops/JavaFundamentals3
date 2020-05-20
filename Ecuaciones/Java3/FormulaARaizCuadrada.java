package Java3;

import javax.swing.JOptionPane;

public class FormulaARaizCuadrada {

	public static void main(String[] args) {
			
		double a; // Respuesta
		
		double x = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de x"));
		
		double exponente = 5;
		
		double numero = 6;
		
		double divisor = 4;
		
		double raiz = (Math.pow(x, exponente)-6); // Resultado dentro de la Raiz
		
		double raizCuadrada = Math.sqrt(raiz); // Sacar la raiz Cuadrada
		
		
		a = raizCuadrada / divisor;
		
		System.out.println("Resultado de la primera formula: " + a);
		
	
		
		
		
		
		
		

	}

}
