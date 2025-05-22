package Operaciones;

import java.util.Scanner;

public class Operaciones {
	int a, b,c, resultado;
	
	Scanner scanner = new Scanner(System.in);
	
	public void multiplicar()  {
        System.out.print("Ingresa el primer número: ");
        a = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        b = scanner.nextInt();

        resultado =multiplicar(a, b);
        System.out.println("Resultado: " + resultado);
		
		
    }
	public void multiplicarSobrecarga() 
		{
	        System.out.print("Ingresa el primer número: ");
	        a = scanner.nextInt();

	        System.out.print("Ingresa el segundo número: ");
	        b = scanner.nextInt();

	        System.out.print("Ingresa el tercer número: ");
	        c = scanner.nextInt();

	        resultado = multiplicar(a, b, c);
	        System.out.println("Resultado: " + resultado);
	    }
	
	private int multiplicar(int a, int b) {
        return a * b;
    }

    private int multiplicar(int a, int b, int c) {
        return a * b * c;
    }
		
    


}
