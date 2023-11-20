package exemploProdutoUpdate;

import java.util.Locale;
import java.util.Scanner;

import exemploProdutoUpCodigo.Produto;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		double price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		int quantity = sc.nextInt();
		
	    Produto p = new Produto(name, price, quantity);
		
		System.out.println("============================================================");
		System.out.println("Product data: " + p);
		System.out.println("============================================================");
		
		System.out.println("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		p.addProducts(quantity);
		
		System.out.println("============================================================");
		System.out.println("Updated data: " + p);
		System.out.println("============================================================");
		
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		p.removeProducts(quantity);
		
		System.out.println("============================================================");
		System.out.println("Updated data: "+ p);
		System.out.println("============================================================");
		sc.close();	
		}

}
