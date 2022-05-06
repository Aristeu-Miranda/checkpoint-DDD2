package estrutura_repeticao;

import java.util.Scanner;

public class Ex23DoWhile {

	public static void main(String[] args) {
		try(Scanner sexo = new Scanner(System.in)) {
			String gen;
			
			do {
				System.out.printf("Digite o seu sexo [M/F]: ");
				gen = sexo.next();
				gen = gen.toUpperCase();
				}
			while (!"M".equals(gen) && !"F".equals(gen));				
			
			System.out.printf("Parabéns! Você digitou %s", gen);
		}

	}

}
