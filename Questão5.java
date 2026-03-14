package atividade1.java;
import java.util.Scanner;

public class Questão5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe a opção de Prato: [1] Vegetariano, [2] Peixe, [3] Frango ou [4] Carne");
		int prato, sobremesa, bebida;
		int calorias = 0;
		prato = s.nextInt();
		
		
		if(prato == 1) {
			calorias += 180;
		}
		else {
			if(prato == 2) {
				calorias += 230;
			}
			else {
				if(prato == 3) {
					calorias += 250;
				}
				else {
					if(prato == 4) {
						calorias += 350;
					}
				}
			}
		}
		System.out.println("Informe a opcção de Sobremesa: [1] Abacaxi, [2] Sorvete diet, [3] Mouse diet, [4] Mouse chocolate");
		sobremesa = s.nextInt();
		
		if(sobremesa == 1) {
			calorias += 75;
		}
		else {
			if(sobremesa == 2) {
				calorias += 110;
			}
			else {
				if(sobremesa == 3) {
					calorias += 170;
				}
				else {
					if(sobremesa == 4) {
						calorias += 200;
					}
				}
			}
		
				}
		System.out.println("Informe a opção de Bebida: [1] Chá, [2] Suco de laranja, [3] Suco de melão, [4] Refri diet");
		bebida = s.nextInt();
		
		if(bebida == 1) {
			calorias += 20;
		}
		else {
			if(bebida == 2) {
				calorias += 70;
			}
			else {
				if(bebida == 3) {
					calorias += 100;
				}
				else {
					if(bebida == 4) {
						calorias += 65;
					}
				}
			}
		
				}
		System.out.println("O valor calórico da refeição é de: " + calorias + " cal");
		
		

	}

}
