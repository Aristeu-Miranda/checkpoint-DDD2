package entrada_processamento_saida;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
	try (Scanner ler = new Scanner(System.in)) {
		double produtoA, produtoB, produtoC, produtoD, produtoE, soma, pag, troco;
		
		System.out.printf("Digite o valor do primeiro produto: ");
		produtoA = ler.nextDouble();
		
		System.out.printf("Digite o valor do segundo produto: ");
		produtoB = ler.nextDouble();
		
		System.out.printf("Digite o valor do terceiro produto: ");
		produtoC = ler.nextDouble();
		
		System.out.printf("Digite o valor do quarto produto: ");
		produtoD = ler.nextDouble();
		
		System.out.printf("Digite o valor do quinto produto: ");
		produtoE = ler.nextDouble();
		
		soma = produtoA + produtoB + produtoC + produtoD + produtoE;
		
		System.out.printf("A soma total dos produtos é: R$ %s", soma);
		
		System.out.printf("\nDigite o valor do pagamento: R$ ");
		pag = ler.nextDouble();
		
		troco = pag - soma;
		
		System.out.printf("O seu troco é de: R$ %.2f", troco);
	}
	
	
	
	}

}
