import java.util.Scanner;

public class JavaFundamentals {

	public static void main(String[] args) {
		//Instanciamos la clase scanner para poder ingresar datos
		Scanner teclado = new Scanner(System.in);
		//Mostramos en la pantalla la sgte info
		System.out.println("Digita la cantidad de personas que se han apuntado para ir al viaje");
		int num = teclado.nextInt(); //Capturamos la informacion y la guardamos en la var
		
		int resultado = num/45; //Buscamos el cociente
	
		if (resultado >0) { //Comparamos si el cociente es mayor que 0
				int NumDeBuses = num/45;
				int NumDeFurgonetas = num%45;
				
				System.out.println("Cuenta con los requisitos para ir en bus \n "
						+ "Para "+ num + " personas Se necestan los sgtes buses " + NumDeBuses + "\n"
								+ "Y las personas que deban de viajar en la furgoneta es de : "+NumDeFurgonetas);
			
		}else {//Si no es mayor que 0, entonces no se necesita buses
			System.out.println("No cuenta con con los pasajeros suficientes \n "
					+"Los " +num+ " Estudiantes tendran que ir en furgonetas");
		}
		
	}

}
