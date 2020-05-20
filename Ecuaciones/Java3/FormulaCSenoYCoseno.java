package Java3;

import javax.swing.JOptionPane;

public class FormulaCSenoYCoseno {

	public static void main(String[] args) {
		
		double c; //Respuesta
		
		double z = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de z"));
		
		double x = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de x"));
		
		int numero1 = 4; //Multiplica el coseno
		
		int numero2 = 5; //Divide lo que esta en el parentesis
	
		double resultadoParentesis = z / numero2;
		
		double exponente = 2;
		
		double resultado1Coseno = (numero1 * (Math.cos(resultadoParentesis)));
		
		// Operación del Seno
		
		double resultado2Potencia = (Math.pow(x, exponente));
		
		double seno = Math.sin(resultado2Potencia);
		
		c = resultado1Coseno - seno;
		
		System.out.println("Respuesta de la Ecuacion: " + c);
		
		

	}

}
