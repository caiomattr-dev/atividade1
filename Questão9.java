package atividade1.java;
import java.util.Scanner;

public class Questão9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Insira 5 números inteiros:");
		double n1 = s.nextDouble();
        double n2 = s.nextDouble();
        double n3 = s.nextDouble();
        double n4 = s.nextDouble();
        double n5 = s.nextDouble();
        double m = 0;
        m = (n1 + n2 + n3 + n4 + n5) / 5;

        System.out.println("Média igual a: " + m);
        if (n1 > m) System.out.println(n1);
        if (n2 > m) System.out.println(n2);
        if (n3 > m) System.out.println(n3);
        if (n4 > m) System.out.println(n4);
        if (n5 > m) System.out.println(n5);

	}

}
