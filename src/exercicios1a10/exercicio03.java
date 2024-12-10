package exercicios1a10;

import java.util.Scanner;

public class exercicio03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		 System.out.print("Informe a idade da pessoa: ");
	        int idade = scan.nextInt();

	        String classificacao;
	        switch (idade / 10) {  
            case 0: 
            case 1: 
                if (idade <= 12) {
                    classificacao = "Crianca";
                } else {
                    classificacao = "Adolescente";
                }
                break;
            case 2: 
                classificacao = "Adulto";
                break;
            case 3: 
            default:
                classificacao = "Idoso";
        }
	        System.out.println("A pessoa e: " + classificacao);

	        scan.close();

	}
}
