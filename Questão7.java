package atividade1.java;
import java.util.Scanner;

public class Questão7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um número");
        long num = s.nextLong();

if(num % 2 ==0){
    System.out.println("O número é par");
}
else{
    System.out.println("O número é ímpar");
}

	}

}
