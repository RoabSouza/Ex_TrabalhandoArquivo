import java.util.ArrayList;
import java.util.List;

public class Pedido {

	List<Produto> pr = new ArrayList<>();

	public void AddPr(Produto prod) {

		pr.add(prod);

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (Produto prod : pr) {
			
			sb.append("Produto: " + prod.getName() + "\n");
			sb.append("Preço: " + prod.Pfinal() + "\n");
			sb.append("Produto: " + prod.getQtd() + "\n");
			sb.append("++++++++++++++++++++++++++++++++++++++ \n");

		}

		return sb.toString();
	}

}
