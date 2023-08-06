
public class Produto {

	private String Name;
	private int Qtd;
	private double Preco;

	public Produto() {

	}

	public Produto(String name, double preco, int qtd) {
		Name = name;
		Preco = preco;
		Qtd = qtd;

	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getQtd() {
		return Qtd;
	}

	public void setQtd(int qtd) {
		Qtd = qtd;
	}

	public void setPreco(double preco) {
		Preco = preco;
		
		this.Preco *= Qtd;
	}

	public double Pfinal() {

		this.Preco *= Qtd;

		return Preco;
	}

	
}
