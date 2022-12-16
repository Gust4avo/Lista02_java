package lista02;

import java.util.Scanner;

public class Ex08 {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite o tempo gasto: ");
		float tempo = sc.nextFloat();
		System.out.println("Digite a velocidade média: ");
		float veloci = sc.nextFloat();
		float distancia = tempo * veloci;
		float litros = distancia/12;
		System.out.println("A velocidade media foi de: "+ veloci);
		System.out.println("O tempo gasto na viagem foi de: "+tempo);
		System.out.println("A distancia percorrida foi de: "+distancia);
		System.out.println("E a quantidade de gasolina gasta em litros foi de: "+ litros);
		sc.close();
		
	}

}
