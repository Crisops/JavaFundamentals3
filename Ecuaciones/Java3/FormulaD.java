package Java3;

import javax.swing.JOptionPane;

public class FormulaD {

	public static void main(String[] args) {
		
		double d; //Respuesta
		
		
		//Dentro de la raiz
		double numero1 = 6;
		double exponente1 = 4;
		double exponente2 = 3;
		
		boolean valor = false;
		
		do {
			
			double x = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la x"));
			
			double y = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la y"));
			
			double raiz = (numero1 * x - (Math.pow(y, exponente2)));
			
			if(raiz > 0) {
				valor = true;
				double raizCuadrada = Math.sqrt(raiz);
				
				double base1 = Math.pow(x, exponente1);
				
				d = base1 - raizCuadrada;
				
				
				System.out.println("Resultado de la ecuacion: " + d);
				
				
			}else {
				System.out.println("Error. El resultado dentro de la raiz es negativo");
			}
			
			
		}while(!valor);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
