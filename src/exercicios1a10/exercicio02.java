package exercicios1a10;

import java.util.Scanner;

public class exercicio02 {
	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
				
			System.out.println("Insira um numero: ");
			int numero1 = scan.nextInt();
				
			System.out.println("Insira o segundo numero: ");
			int numero2 = scan.nextInt();
				
			System.out.println("Informe o operador matematico (+, -, *, /): ");
			String operador = scan.next();
				
			switch (operador) {
			case "+":
				int resultado = numero1 + numero2; 
				System.out.println("Resultado da soma e: " + resultado);
			break;
			case "-":
			    resultado = numero1 - numero2;
			    System.out.println("Resultado da subtracao e: " + resultado);
		    break;
		    case "*":
			    resultado = numero1 * numero2;
			    System.out.println("Resultado da multiplicacao: " + resultado);
		    break;
		    case "/":
			    if (numero2 != 0) {
			    resultado = numero1 / numero2;
			    System.out.println("Resultado da divisao: " + resultado);
		    } else {
		    	System.out.println("Erro: Divis�o por zero n�o permitida.");
		    }
		    break;
		    default:
		    	System.out.println("Erro: Operador inv�lido.");
	    }	
	    scan.close();
	}
}