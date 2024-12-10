package exercicios1a10;

import java.util.Scanner;

public class exercicio09 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

        System.out.print("Informe a classificacao do filme (G, PG, PG-13 ou R): ");
        
        String classificacao = scan.nextLine().toUpperCase();

        switch (classificacao) {
            case "G":
                System.out.println("Livre");
                break;
            case "PG":
                System.out.println("Maior de 10 anos");
                break;
            case "PG-13":
                System.out.println("Maior de 13 anos");
                break;
            case "R":
                System.out.println("Maior de 18 anos");
                break;
            default:
                System.out.println("Classificacao invalida. Insira G, PG, PG-13 ou R.");
        }
        scan.close();
	}
}