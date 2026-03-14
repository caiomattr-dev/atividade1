package atividade1.java;
import java.util.Scanner;

public class Questão2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite seu peso em kg");
		double peso = s.nextDouble();
		System.out.println("Digite sua altura em m");
		double alt = s.nextDouble();
		
        double imc = (peso / (alt * alt));
        System.out.println("Seu IMC é:" + imc);
        
        
        if(imc < 18.5) {
        	System.out.println("Abaixo do peso");
        }
        else {
        	if(imc >= 18.5 && imc < 25) {
        		System.out.println("Peso Normal");
        	}
        	else {
        		if(imc >= 25 && imc < 30) {
        			System.out.println("Sobrepeso");
        		}
        		else {
            		if(imc >= 30 && imc < 40) {
            			System.out.println("Obesidade");
        	}
            		else {
            			if(imc >= 40) {
                			System.out.println("Obesidade Mórbida");
            		}
           }
          }
         }
     }		
        
	}

}
