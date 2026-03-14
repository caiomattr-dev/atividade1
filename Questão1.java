package atividade1.java;
import java.util.Scanner;

public class Questão1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite um número");
		int num = s.nextInt();
		
		if(num % 10 == 0) {
			System.out.println("Esse número é divisível por 10");
			
		}
		else {
			if(num % 5 == 0) {
				System.out.println("Esse número é divível por 5");
			}
			else {
				if(num % 2 == 0) {
					System.out.println("Esse número é divisível por 2");
				}
				else {
					if(num % 10 != 0 && num % 5 != 0 && num % 2 != 0) {
						System.out.println("Esse número não é divisível por nenhum dos acima");
					}
				}
			}
		}
		
			
	}

}
