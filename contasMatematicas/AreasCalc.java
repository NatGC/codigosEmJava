package contasMatematicas;

import java.util.Scanner;

public class AreasCalc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		
		System.out.println("Digite o valor de A");
		double A = sc.nextFloat();
		System.out.println("Digite o valor de B");
		double B = sc.nextFloat();
		System.out.println("Digite o valor de C");
		double C = sc.nextFloat();
		
		sc.close();
		//a
		System.out.println("--------------------------------------------");
		double atr= (A*C)/2;
		System.out.printf("Triangulo: %.2f%n", atr);
		System.out.println("--------------------------------------------");		
		//b
		double ac= pi*(C*C);
		System.out.printf("Circulo: %.2f%n", ac);
		System.out.println("--------------------------------------------");	
		//c
		double at = ((A+B)*C)/2;
		System.out.printf("Trapezio: %.2f%n", at);
		System.out.println("--------------------------------------------");	
		//d
		double aq = B*B;	
		System.out.printf("Quadrado: %.2f%n", aq);
		System.out.println("--------------------------------------------");	
		//e
		double ar = A*B;
		System.out.printf("Retangulo: %.2f%n", ar);
		System.out.println("--------------------------------------------");	
	}

}
