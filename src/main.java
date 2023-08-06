import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {
	public static void main(String[] args) throws InterruptedException, IOException {

		Scanner sc = new Scanner(System.in);
		Pedido pe = new Pedido();

		System.out.print("Entre com a quantidade de produtos: ");
		int qt = sc.nextInt();

		for (int i = 0; i < qt; i++) {

			System.out.println("Entre com os dados do " + (i + 1) + " produto");

			System.out.print("Digite o nome do produto: ");
			String Prod = sc.next();
			System.out.print("Digite o preço do produto: ");
			double Preço = sc.nextDouble();

			System.out.print("Digite o Quantidade do produto: ");
			int Qtd = sc.nextInt();

			Produto pr = new Produto(Prod, Preço, Qtd);

			pe.AddPr(pr);

			Thread.sleep(600);
			for (int i2 = 0; i2 < 50; i2++) {
				System.out.println("");
			}
		}

		System.out.println(pe.toString());

		String path = "C:\\Users\\roabs\\OneDrive\\Área de Trabalho\\file\\out.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {

			bw.write(pe.toString());
			bw.newLine();

		} catch (IOException e) {
			e.getStackTrace();
		}

	}

}
