package Java3;

import javax.swing.JOptionPane;

public class FormulaBExponentes {

	public static void main(String[] args) {
		
		double b; //Respuesta
		
		double x = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la x"));
		
		
		//Base predetermianda para el exponente 2
		double base2 = 6;
		
		double exponente2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del exponente de la base numero 2"));
		
		//Exponencial numero 1
		double valor1 = Math.pow(x, x);
		
		//Exponencial numero 2
		double valor2 = Math.pow(base2, exponente2);
		
		b = valor1 - valor2;
		
		System.out.println("Resultado del exponencial numero 1: " + valor1);
		System.out.println();
		System.out.println("Resultado del exponencial numero 2: " + valor2);
		System.out.println();
		System.out.println();
		System.out.println("Resultado de la ecuacion: " + b);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
