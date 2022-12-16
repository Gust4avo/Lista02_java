package lista02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		float Fahrenheit= sc.nextFloat();
		float celsius = ( (Fahrenheit -32) * 5) / 9;
		System.out.println("A temperatura em graus celsius " + celsius );
		
		sc.close();
		
		
	}
	
}
