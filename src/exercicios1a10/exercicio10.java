package exercicios1a10;

import java.util.Scanner;

public class exercicio10 {
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

        System.out.print("Informe um numero para calcular o fatorial: ");
        int numeroFatoral = scan.nextInt();

        int fatorial = 1;

        switch (numeroFatoral) {
            case 0:                
                fatorial = 1;
                System.out.println("O fatorial de 0 e: " + fatorial);
                break;
            case 1:                
                fatorial = 1;
                System.out.println("O fatorial de 1 e: " + fatorial);
                break;
            default:                
                if (numeroFatoral > 1) {
                    fatorial = 1; 
                    for (int i = 2; i <= numeroFatoral; i++) {
                        fatorial *= i; 
                    }
                    System.out.println("O fatorial de " + numeroFatoral + " e: " + fatorial);
                }
        }
        scan.close();
	}
}