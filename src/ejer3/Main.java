package ejer3;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		double promedio;
		int valor;
		int suma=0;
		int i=0;
	
		System.out.println("Ingrese las edades:");	
		int[] edades = new int[10];
	
		
	
		do {
			valor = teclado.nextInt();
			if (valor <18) {
				System.out.println("Error, las personas deben ser mayores de edad, ingrese de nuevo");
				
			}
			else {
				
				edades [i] = valor;
				suma=(suma+valor);
				i++;
			}
		}while(i <10);
		
		
		promedio =  suma/i;
		System.out.print("Promedio de edades ingresadas: " + promedio);

	}
}
