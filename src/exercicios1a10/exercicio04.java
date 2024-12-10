package exercicios1a10;

import java.util.Scanner;

public class exercicio04 {
public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);

        int opcoes;

        do {
            System.out.println("Menu de Opcoes:");
            System.out.println("(1)Exibir 'Ola, Mundo!'");
            System.out.println("(2)Exibir 'Bem-vindo ao Java'");
            System.out.println("(3)Sair");
            System.out.print("Escolha uma das opcoes (1, 2 ou 3):");
            
            opcoes = scan.nextInt();
            switch (opcoes) {
                case 1:
                    System.out.println("Ola, Mundo!");
                    break;
                case 2:
                    System.out.println("Bem-vindo ao Java");
                    break;
                case 3:
                    System.out.println("Fechando programada");
                    break;
                default:
                    System.out.println("Opcao invalida. Por favor tente novamente.");
            }
            
            System.out.println(); 
            
        } while (opcoes != 3);  

        scan.close();

	}
}