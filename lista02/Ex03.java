package lista02;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu salario atual: ");
		int salario = sc.nextInt();
		System.out.println("Digite a porcentagem de rajuste: ");
		int reajuste = sc.nextInt();
		
		int result = salario + (salario * reajuste /100);
		
		System.out.println(result);
		sc.close();
		
		
	}

}
