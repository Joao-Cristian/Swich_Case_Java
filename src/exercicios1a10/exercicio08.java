package exercicios1a10;

import java.util.Scanner;

public class exercicio08 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

        System.out.println("Escolha uma opcao de conversao:");
        System.out.println("(1) Celsius para Fahrenheit");
        System.out.println("(2) Fahrenheit para Celsius");
        System.out.print("Informe o numero da opcao escolhida (1 ou 2): ");
        
        int opcoes = scan.nextInt();

        double temperatura, resultadoFinal;

        switch (opcoes) {
            case 1:
                System.out.print("Insira a temperatura em Celsius: ");
                temperatura = scan.nextDouble();
                resultadoFinal = (temperatura * 9 / 5) + 32; 
                System.out.printf("%.2f Celsius equivale a %.2f Fahrenheit.\n", temperatura, resultadoFinal);
                break;
                
            case 2:
                System.out.print("Insira a temperatura em Fahrenheit: ");
                temperatura = scan.nextDouble();
                resultadoFinal= (temperatura - 32) * 5 / 9; 
                System.out.printf("%.2f Fahrenheit equivale a %.2f Celsius.\n", temperatura, resultadoFinal);
                break;                
            default:
                System.out.println("Opcao invalida! Por favor, escolha 1 ou 2.");
        }
        scan.close();
	}
}