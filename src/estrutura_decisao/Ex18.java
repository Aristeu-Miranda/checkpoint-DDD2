package estrutura_decisao;
import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		try (Scanner vm = new Scanner(System.in)) {
			double a, v0, t, velocidade;
			
			System.out.printf("Digite a velocidade inicial (km/h): ");
			v0 = vm.nextDouble();
			
			System.out.printf("Digite a aceleração (km/h): ");
			a = vm.nextDouble();
			
			System.out.printf("Digite o tempo de percurso(t): ");
			t = vm.nextDouble();
			
			velocidade = v0 + a * t;
			
			if (velocidade <= 40) {
				System.out.printf("veiculo muito lento!");
			} else if (velocidade <= 60) {
				System.out.printf("velocidade permitida!");
			} else if (velocidade <= 80) {
				System.out.printf("velocidade de cruzeiro!");
			} else if (velocidade <= 120) {
				System.out.printf("veiculo rápido!");
			} else {
				System.out.printf("veiculo muito rápido!");
			}
			
		}

	}

}
