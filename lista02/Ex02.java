package lista02;

import java.util.Scanner;

public class Ex02 {

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o numero total de eleitores: ");
	int eleitores = sc.nextInt();
	System.out.println("Digite a quantidade de voto brancos: ");
	int brancos = sc.nextInt();
	System.out.print("Digite a quantidade de votos nulos: ");
	int nulos = sc.nextInt();
	System.out.println("Digite a quantidade de votos validos: ");
	int validos = sc.nextInt();
	
	int total_branc =  100 * brancos / eleitores;
	int total_nulo = 100 * nulos / eleitores;
	int total_validos = 100* validos / eleitores;
	
	
	System.out.println(total_branc);
	System.out.println(total_nulo);
	System.out.println(total_validos);
	
	sc.close();
	
	
	
}

}
