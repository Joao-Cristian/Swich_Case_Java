package exercicios1a10;

import java.util.Scanner;

public class exercicio07 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

        System.out.print("Informe o valor do salario: R$ ");
        double salario = scan.nextDouble();

        double imposto;
        
        String faixaSalarial;

        switch ((int) (salario / 1500)) {
            case 0: 
                imposto = salario * 0.05; 
                faixaSalarial = "ate R$ 1.500,00";
                break;
            case 1: 
                if (salario <= 3000) {
                    imposto = salario * 0.10; 
                    faixaSalarial = "de R$ 1.501,00 a R$ 3.000,00";
                } else {
                    imposto = salario * 0.15; 
                    faixaSalarial = "acima de R$ 3.000,00";
                }
                break;
            default: 
                imposto = salario * 0.15; 
                faixaSalarial = "acima de R$ 3.000,00";
                break;
        }

        System.out.println("Faixa salarial: " + faixaSalarial);
        System.out.printf("O imposto a ser pago e: R$ %.2f\n", imposto);

        scan.close();
	}
}