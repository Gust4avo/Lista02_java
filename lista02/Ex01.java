package lista02;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Digite sua idade em anos: ");
		int anos =sc.nextInt();
		System.out.println("Digite quantos meses passou desde seu ultimo aniversario: ");
		int mes =sc.nextInt();
		System.out.println("Digite quantos dias passou desde o seu ultimo aniversario: ");
		int dia =sc.nextInt();
		int idade = (anos * 365) + (mes * 30) + dia;
		System.out.println("sua idade em dias e: "+ idade +" dias");
		
		sc.close();
		
		
	}

}
