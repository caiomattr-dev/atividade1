package atividade1.java;
import java.util.Scanner;

public class Questão4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe sua idade");
		int idade = s.nextInt();
		
		
		if(idade < 16) {
			System.out.println("Classe eleitoral: Não eleitor");
		}
		else {
			if(idade >= 18 && idade <= 65) {
				System.out.println("Classe eleitoral: Eleitor obrigatório");
			}
			else {
				if(idade == 16 || idade == 17 || idade > 65) {
					System.out.println("Classe eleitoral: Eleitor facultativo");
				}
			}
		}

	}

}
