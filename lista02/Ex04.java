package lista02;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o custo de fabrica do carro: ");
		float valor_fabri = sc.nextFloat();
		float distribuidor = (valor_fabri * 28/100);
		float imposto =  (valor_fabri * 45/100);
		float custo_final = valor_fabri + distribuidor + imposto;
		System.out.println("O custo final para o consumidor é: " + custo_final);
		sc.close();
	}

}
