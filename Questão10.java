package atividade1.java;
import java.util.Scanner;

public class Questão10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Qual é o peso do peixe, em kg? ");
        int peso = s.nextInt();
        int multa = 0;
        int pesoex = 0;

        if(peso > 500){
            System.out.println("Quantos kg está acima do limite? ");
                    pesoex = peso - 500;
            multa = (pesoex * 4);
            System.out.println("O valor da multa é: " + multa);
        }
        else{
            System.out.println("O peso está dentro do limite.");
        }

	}

}
