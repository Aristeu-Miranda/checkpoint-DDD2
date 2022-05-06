package estrutura_decisao;
import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		try (Scanner calculo = new Scanner(System.in)) {
			double alt, peso, imc;
			
			System.out.printf("Digite sua altura: ");
			alt = calculo.nextDouble();
			
			System.out.printf("Digite seu peso: ");
			peso = calculo.nextDouble();
			
			imc = peso / (alt * alt);
			
			if (imc < 20) {
				System.out.printf("Você está abaixo do peso!");
			} else if (imc < 25) {
				System.out.printf("Você está no peso ideal!");
			} else {
				System.out.printf("Você está acima do peso!");
			}
		}

	}

}
