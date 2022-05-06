package entrada_processamento_saida;
import java.util.Scanner;
public class Ex06 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			float dolar, qtd, reais;
			
			System.out.printf("Digite o valor da cotação do dólar atual: ");
			dolar = ler.nextFloat();
			
			System.out.printf("Digite a quantidade de dolar para conversão em reais: ");
			qtd = ler.nextFloat();
			
			reais = dolar * qtd;
			
			System.out.printf("O valor de %s dolares é equivalente a: R$%s", qtd, reais);
		}
		
	}

}
