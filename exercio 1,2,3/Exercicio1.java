package ExercioAula26;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		{
		    int a,m,d,soma,multiM,multiA;
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Digite o ano que nasceu: ");
			a = ler.nextInt();
			System.out.println("Digite o mês que nasceu: ");
			m = ler.nextInt();
			System.out.println("Digite o dia que nasceu: ");
			d = ler.nextInt();
		
			multiM = m*30;
			multiA = (2021 - a) * 365;
			soma = multiM + multiA + d;
			System.out.println("Sua idade em dias: ");
			System.out.println(soma);
			
		}
	}

}
