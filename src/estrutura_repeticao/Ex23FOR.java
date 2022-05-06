package estrutura_repeticao;

import java.util.Scanner;

public class Ex23FOR {

	public static void main(String[] args) {
		try(Scanner sexo = new Scanner(System.in)) {
			String gen;
			String i;
			
			System.out.printf("Digite o seu sexo [M/F]: ");
			gen = sexo.next();
			gen = gen.toUpperCase();
			
			for(i = "M"; !"M".equals(gen) && !"F".equals(gen);) {
				System.out.printf("[ERRO] Sexo inválido. Digite novamente: ");
				gen = sexo.next();
				gen.toUpperCase();
			}
			
			for(i = "F"; !"M".equals(gen) && !"F".equals(gen);) {
				System.out.printf("[ERRO] Sexo inválido. Digite novamente: ");
				gen = sexo.next();
				gen.toUpperCase();
			}
			
			System.out.printf("Parabéns! Você digitou %s", gen);
		}

	}

}
