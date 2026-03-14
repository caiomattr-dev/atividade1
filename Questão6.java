package atividade1.java;
import java.util.Scanner;
public class Questão6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		 System.out.println("Digite um número de 1 a 7");
         int num = s.nextInt();
 
         if(num == 1){
             System.out.println("O dia é Domingo");
         }
         else if(num == 2){
             System.out.println("O dia é Segunda");
         }
         else if(num == 3){
             System.out.println("O dia é Terça");
         }
         else if(num == 4){
             System.out.println("O dia é Quarta");
         }
         else if(num == 5){
             System.out.println("O dia é Quinta");
         }
         else if(num == 6){
             System.out.println("O dia é Sexta");
         }
         else if(num == 7){
             System.out.println("O dia é Sábado");
         }
         else{
             System.out.println("O número não corresponde a um dia");
         }

	}

}
