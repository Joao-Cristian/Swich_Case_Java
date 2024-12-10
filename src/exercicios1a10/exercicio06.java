package exercicios1a10;

import java.util.Scanner;

public class exercicio06 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

        System.out.println("Escolha uma bebida:");
        System.out.println("(1) Cafe");
        System.out.println("(2) Cha");
        System.out.println("(3) Suco");
        System.out.println("(4) Refrigerante");

        System.out.print("Informe o numero da bebida desejada (1, 2, 3 ou 4): ");
        int opcoes = scan.nextInt();

        switch (opcoes) {
            case 1:
                System.out.println("Voce escolheu: Cafe");
                break;
            case 2:
                System.out.println("Voce escolheu: Cha");
                break;
            case 3:
                System.out.println("Voce escolheu: Suco");
                break;
            case 4:
                System.out.println("Voce escolheu: Refrigerante");
                break;
            default:
                System.out.println("Opcao invalida! Escolha um n�mero de 1 a 4.");
        }

        scan.close();

	}
}