package lista02;

import java.util.Scanner;

public class Ex07 {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		
		System.out.println("Digite o raio: ");
		float raio = sc.nextFloat();
		System.out.println("Digite a altura: ");
		float altura = sc.nextFloat();
		double volume = Math.PI * Math.pow(raio, 2) * altura;
		System.out.printf("O volume da lata é: %.5f" , volume);
		sc.close();
		
		
	}

}
