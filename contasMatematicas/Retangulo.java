package contasMatematicas;

import java.util.Scanner;

import contasCodigo.RetangCalc;

public class Retangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		RetangCalc valor = new RetangCalc();
		
		System.out.println("Entre a largura e altura do retangulo");
		valor.height = sc.nextDouble();
		valor.width = sc.nextDouble();
		
		System.out.println();
		System.out.println("Area: " + valor.area());
		System.out.println("Perimetro: " + valor.perimetro());
		System.out.println("Diagonal: " + valor.diagonal());
		
		sc.close();
	}

}
