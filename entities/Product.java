package entities;

public class Product {

	public String nome;
	public double valor;
	public int quantidade;
	
	public double TotalValueInStock(){
		return valor * quantidade;
	}
	
	public void AddProducts(int quantidade) {
		this.quantidade += quantidade;
		System.out.println("Novos produtos adicionados!, total: " + this.quantidade);
	}
	
	public void RemoveProducts(int quantidade) {
		this.quantidade -= quantidade;
		System.out.println("Alguns produtos foram vendidos!, total: " + this.quantidade);
	}

	public String toString(){
		return nome
			+ ", R$ "
			+ String.format("%.2f", valor)
			+ ", "
			+ quantidade
			+ " unidades, Total: "
			+ String.format("%.2f", TotalValueInStock());
	}
}
