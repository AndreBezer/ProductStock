package program;

import java.util.Scanner;

import entities.Product;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Product a = new Product();
		
		System.out.print("Digite o nome do produto: ");
		a.nome = sc.next();
		
		System.out.print("Digite o valor do produto: ");
		a.valor = sc.nextDouble();
		
		System.out.print("Digite a quantidade disponivel em estoque: ");
		a.quantidade = sc.nextInt();

		System.out.printf("Product data: %s\n\n", a);

		System.out.print("Digite quantos produtos entraram: ");
		int entrada = sc.nextInt();
		a.AddProducts(entrada);
		System.out.printf("Product data: %s\n\n", a);
	
		System.out.print("Digite quantos produtos sairam: ");
		int saida = sc.nextInt();
		a.RemoveProducts(saida);
		System.out.printf("Product data: %s\n\n", a);
		
		sc.close();
	}

}
