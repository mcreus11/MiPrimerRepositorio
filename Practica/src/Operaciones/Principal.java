package Operaciones;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		//auxiliar
        Scanner scanner = new Scanner(System.in);
        Operaciones op = new Operaciones();
		int opcion;
		do {
			System.out.println("Elige una opción:");
	        System.out.println("1. Multiplicar");
	        System.out.println("2. Multiplicar (Sobrecarga)");
	        System.out.println("3. Salir");
	        System.out.print("Selecciona una opcion: ");
	        opcion = scanner.nextInt();

	        switch (opcion) {
	            case 1:
	                op.multiplicar();
	                break;
	            case 2:
	                op.multiplicarSobrecarga();
	                break;
	            
	            case 3:
	            	System.out.println("Saliendo del menu");
	            	break;
	            default:
	                System.out.println("Opción no válida.");
	                break;
	        }
	        
	        
	        

		}while(opcion!=3);
		        
	}

}
