package ExercioAula26;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		int s,divH,divM,divS;
	    try (Scanner ler = new Scanner(System.in)) 
	    {
		System.out.println("Digite os segundos necessários para o trabalho: ");
		s = ler.nextInt();
		
	    divH = s/3600;
		divM = (s%3600)/60;
		divS = (s%3600)%60;
		Object horas = divH;
		Object minutos = divM;
		Object segundos = divS;
		System.out.printf("\nTempo estimado é de %d horas %s minutos %d segundos ",horas, minutos,segundos);		
	
			}
		
	}

}
