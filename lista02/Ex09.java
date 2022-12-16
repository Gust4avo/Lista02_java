package lista02;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite o valor da sua fatura: ");
		float valor = sc.nextFloat();
		System.out.println("Quantos dias de atraso: ");
		float atraso = sc.nextFloat();
		System.out.println("Digite o valor da taxa: ");
		float taxa = sc.nextFloat();
		double prestacao = valor + (valor*taxa/100) *atraso;
		System.out.println("O valor da prestação é: "+ prestacao);
		sc.close();
	}

}
