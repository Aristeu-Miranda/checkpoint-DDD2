package estrutura_decisao;
import java.util.Scanner;
public class Ex12 {

	public static void main(String[] args) {
		try (Scanner retangulo = new Scanner(System.in);) {
			double h, b, area;
			
			System.out.printf("Digite a altura do ret�ngulo: ");
			h = retangulo.nextDouble();
			
			System.out.printf("Digite a base do ret�ngulo: ");
			b = retangulo.nextDouble();
			
			area = b * h;
			
			if (area > 100) {
				System.out.printf("Terreno Grande! �rea: %.2f m�", area);
			}
			else {
				System.out.printf("Terreno Pequeno! �rea: %.2f m�", area);
			}
		}

	}

}
