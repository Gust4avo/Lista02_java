package lista02;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		float valorA, valorB, valorC;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Digite o valor A: ");
		valorA =sc.nextInt();
		System.out.println("Digite o valor B: ");
		valorB =sc.nextInt();
		
		valorC = valorA;
		valorA = valorB;
		valorB =valorC;
		
		System.out.println("O numero correspondente de A é: " + valorA + " e o correspondente de B é: " + valorC);
		
		sc.close();
	}
	
}
