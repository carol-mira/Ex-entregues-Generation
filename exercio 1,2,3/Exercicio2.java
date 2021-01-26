package ExercioAula26;

import java.util.Scanner;

public class Exercicio2 {

public static void main(String[] args) {
	
	int a,m,d,divA,divM,divD;
	try (Scanner ler = new Scanner(System.in)) {
		
		System.out.println("Digite a quantidade de dias que já viveu:");
		d = ler.nextInt();
		
		divA = d/365;
		divM= (d%365)/30;
		divD= (d%365)%30;
		Object anos = divA;
		Object meses = divM;
		Object dias = divD;
		System.out.printf("Sua idade é de %d anos %s meses e %d dias",anos,meses,dias);
				
	}
	
}
}
