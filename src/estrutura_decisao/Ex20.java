package estrutura_decisao;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		try (Scanner nota = new Scanner(System.in)) {
			int p1;
			
			System.out.printf("Digite a nota na primeira prova: ");
			p1 = nota.nextInt();
			
			switch (p1) {
			case 1: 
				System.out.printf("Voc� precisa tirar no m�nimo 7 na segunda prova para ser aprovado!");
				break;
			case 2: 
				System.out.printf("Voc� precisa tirar no m�nimo 6,5 na segunda prova para ser aprovado!");
				break;
			case 3: 
				System.out.printf("Voc� precisa tirar no m�nimo 6 na segunda prova para ser aprovado!");
				break;
			case 4: 
				System.out.printf("Voc� precisa tirar no m�nimo 5,5 na segunda prova para ser aprovado!");
				break;
			case 5: 
				System.out.printf("Voc� precisa tirar no m�nimo 5 na segunda prova para ser aprovado!");
				break;
			case 6: 
				System.out.printf("Voc� precisa tirar no m�nimo 4,5 na segunda prova para ser aprovado!");
				break;
			case 7: 
				System.out.printf("Voc� precisa tirar no m�nimo 4 na segunda prova para ser aprovado!");
				break;
			case 8:
				System.out.printf("Voc� precisa tirar no m�nimo 3,5 na segunda prova para ser aprovado!");
				break;
			case 9:
				System.out.printf("Voc� precisa tirar no m�nimo 3 na segunda prova para ser aprovado!");
				break;
			case 10:
				System.out.printf("Voc� precisa tirar no m�nimo 2,5 na segunda prova para ser aprovado!");
				break;
			default:
				System.out.printf("Digite uma nota v�lida!");
			}
		}

	}

}
