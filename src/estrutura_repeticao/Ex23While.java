package estrutura_repeticao;
import java.util.Scanner;

public class Ex23While {

	public static void main(String[] args) {
		try(Scanner sexo = new Scanner(System.in)) {
			String gen;
			
			System.out.printf("Digite o seu sexo [M/F]: ");
			gen = sexo.next();
			gen = gen.toUpperCase();
			
			while (!"M".equals(gen) && !"F".equals(gen)) {
				System.out.printf("[ERRO] Sexo inv?lido. Digite novamente: ");
				gen = sexo.next();
				gen.toUpperCase();
				}
			
			System.out.printf("Parab?ns! Voc? digitou %s", gen);
		}

	}

}
