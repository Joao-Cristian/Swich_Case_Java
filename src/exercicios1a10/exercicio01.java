package exercicios1a10;

import java.util.Scanner;

public class exercicio01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira um numero de 1 a 7: ");
		int numeroSemana = scan.nextInt();
		
		switch(numeroSemana) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-Feira");
			break;
		case 3:
			System.out.println("Ter�a-feira");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 5:
			System.out.println("Quinta-feira");
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;
		case 7:
			System.out.println("S�bado");
			break;
			
		}
		scan.close();
	}
}
