package estrutura_decisao;
import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		try (Scanner calculo = new Scanner(System.in)) {
			double alt, peso, imc;
			String sexo;
			
			System.out.printf("Digite sua altura: ");
			alt = calculo.nextDouble();
			
			System.out.printf("Digite seu peso: ");
			peso = calculo.nextDouble();
			
			System.out.printf("Digite seu sexo: ");
			sexo = calculo.next();	
			sexo = sexo.toLowerCase();
			
			imc = peso / (alt * alt);
			
			if (sexo == "masculino") {
				System.out.printf("Sexo: %s", sexo);
				if (imc < 20) {
					System.out.printf("\nVoc� est� abaixo do peso!");
				} else if (imc < 25) {
					System.out.printf("\nVoc� est� no peso ideal!");
				} else {
					System.out.printf("\nVoc� est� acima do peso!");
				}
			} else {
				System.out.printf("Sexo: %s", sexo);
				if (imc < 19) {
					System.out.printf("\nVoc� est� abaixo do peso!");
				} else if (imc < 24) {
					System.out.printf("\nVoc� est� no peso ideal!");
				} else {
					System.out.printf("\nVoc� est� acima do peso!");
				}
			}
		}

	}

}
