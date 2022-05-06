package ex34;

import java.util.Scanner;

public class SistemaDeClientes {

	public static void main(String[] args) {
		try (Scanner clientes = new Scanner(System.in)) {
			Cliente[] listaClientes = new Cliente[2];
			char possuiContaBancaria;
			int id;
			String nome;
			int idade;
			String email;
			ContaBancaria conta;
			char atualizaEmail;
			
			for(int i=0; i <= 1; i++) {
				System.out.printf("Digite o ID do cliente: ");
				id = clientes.nextInt();
				
				System.out.printf("Digite o nome do cliente: ");
				nome = clientes.next();
				
				System.out.printf("Digite a idade do cliente: ");
				idade = clientes.nextInt();
				
				System.out.printf("Digite o e-mail do cliente: ");
				email = clientes.next();
				
				System.out.printf("Você possui conta bancária? [S/N] ");
				possuiContaBancaria = clientes.next().charAt(0);
				
				if(possuiContaBancaria == 'S') {
					ContaBancaria cta = new ContaBancaria();
					
					System.out.printf("Digite a agencia: ");
					cta.agencia = clientes.next();
					
					System.out.printf("Digite a conta: ");
					cta.numero = clientes.next();
					
					System.out.printf("Digite o saldo: ");
					cta.saldo = clientes.nextDouble();
					
					conta = cta;
					
				} else {
					conta = null;
				}
				
				Cliente a = new Cliente(id, nome, idade, email, conta);
				
				listaClientes[i] = a;
			}
			
			for(int i=0; i<2; i++) {
				System.out.printf("\n%s", listaClientes[i].exibirNomeIdade());
				System.out.printf("\n%s", listaClientes[i].exibirDadosConta());
				
				System.out.printf("\nDeseja atualizar o email? [S/N] ");
				atualizaEmail = clientes.next().charAt(0);
				
				if(atualizaEmail == 'S') {
					System.out.printf("Digite o e-mail do cliente: ");
					email = clientes.next();
					
					listaClientes[i].atualizarEmail(email);
					System.out.printf("Email alterado com sucesso! Novo e-mail: %s", listaClientes[i].email);
				}
			}
		}

	}

}
