package atividade1.java;
import java.util.Scanner;

public class Questão8 {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        
        System.out.println("Digite suas 4 notas");
        double nota1 = s.nextDouble();
        double nota2 = s.nextDouble();
        double nota3 = s.nextDouble();
        double nota4 = s.nextDouble();
        double exame = 0;
        double notafim = 0;
        
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Sua média é: " + media);
        
        if(media >= 7){
            System.out.println("Aprovado " + media);
        }
        else{
            if(media < 7){
                System.out.println("Reprovado com a média: " + media);
                System.out.println("Insira a nota do exame: ");
                exame = s.nextDouble();
                notafim = (exame + media) / 2;
            }
                if(notafim >= 5){
                    System.out.println("Você foi aprovado! Com a média: " + notafim);
                }
                else{
                    if(notafim < 5){
                        System.out.println("Você foi reprovado, com a média: " + notafim);
                    }
                }
            
        }

	}

}
