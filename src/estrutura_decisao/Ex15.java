package estrutura_decisao;
import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		try (Scanner tri = new Scanner(System.in)) {
			double l1, l2, l3;
			
			System.out.printf("Digite o primeiro lado: ");
			l1 = tri.nextDouble();
			
			System.out.printf("Digite o segundo lado: ");
			l2 = tri.nextDouble();
			
			System.out.printf("Digite o terceiro lado: ");
			l3 = tri.nextDouble();
			
			if (l1 + l2 > l3 && l2 + l3 > l1 && l3 + l1 > l2) {
				System.out.printf("Os lados formam um triangulo!");
				if (l1 != l2 && l1 != l3 && l2 != l3) {
					System.out.printf("\nOs lados formam um triangulo Escaleno!");
				} else if (l1 == l2 && l2 != l3 || l2 == l3 && l3 != l1 || l3 == l1 && l1 != l2) {
					System.out.printf("\nOs lados formam um triangulo Isósceles!");
				} else {
					System.out.printf("\nOs lados formam um triangulo Equilátero!");
				}
			} else {
				System.out.printf("Os lados não formam um triangulo!");
			}
		}

	}

}
