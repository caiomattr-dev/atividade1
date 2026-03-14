package atividade1.java;
import java.util.Scanner;

public class Questão3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite seu saldo médio");
		double saldo = s.nextDouble();
	
		if(saldo >= 0 && saldo <= 500) {
			System.out.println("Não está apto para receber crédito especial");
		}
		else {
			if(saldo >= 501 && saldo <= 1000) {
				double extra = saldo + (saldo * 0.3);
				double cre = saldo * 0.3;
				System.out.println("O valor do crédito é: " + cre);
				System.out.println("Seu saldo final é: " + extra);
			}
			else {
				if(saldo >= 1001 && saldo <= 3000) {
					double extra = saldo + (saldo * 0.4);
					double cre = saldo * 0.4;
					System.out.println("O valor do crédito é: " + cre);
					System.out.println("Seu saldo final é: " + extra);	
				}
				else {
					if(saldo >= 3001) {
						double extra = saldo + (saldo * 0.5);
						double cre = saldo * 0.5;
						System.out.println("O valor do crédito é: " + cre);
						System.out.println("Seu saldo final é: " + extra);
					}
				}
			}
		}
		
		

	}

}
