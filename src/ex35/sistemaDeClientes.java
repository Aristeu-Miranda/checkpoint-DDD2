package ex35;

import java.util.Scanner;
import ex35.Cliente;
import ex35.ContaBancaria;

public class sistemaDeClientes {

	public static void main(String[] args) {
		try (Scanner clientes = new Scanner(System.in)) {
			Cliente[] cli = new Cliente[2];
			char possuiContaBancaria;
			int id;
			String nome;
			int idade;
			String email;
			ContaBancaria conta;
			char atualizaEmail;
			String agencia;
			String numero;
			Double saldo;
			
			for(int i=0; i <= 1; i++) {
				Cliente p = new Cliente();
				
				System.out.printf("Digite o ID do cliente: ");
				id = clientes.nextInt();
				p.setId(id);
				
				System.out.printf("Digite o nome do cliente: ");
				nome = clientes.next();
				p.setNome(nome);
				
				System.out.printf("Digite a idade do cliente: ");
				idade = clientes.nextInt();
				p.setIdade(idade);
				
				System.out.printf("Digite o e-mail do cliente: ");
				email = clientes.next();
				p.setEmail(email);
				
				System.out.printf("Você possui conta bancária? [S/N] ");
				possuiContaBancaria = clientes.next().charAt(0);
				
				if(possuiContaBancaria == 'S') {
					ContaBancaria cta = new ContaBancaria();
					
					
					System.out.printf("Digite a agencia: ");
					agencia = clientes.next();
					
										
					System.out.printf("Digite a conta: ");
					numero = clientes.next();
					
					
					System.out.printf("Digite o saldo: ");
					saldo = clientes.nextDouble();
					
					
					conta = cta;
					
				} else {
					conta = null;
				}
				
				Cliente a = new Cliente(id, nome, idade, email, conta);
				
				cli[i] = a;
			}
			
			for(int i=0; i<2; i++) {
				System.out.printf("\n%s", cli[i].exibirNomeIdade());
				System.out.printf("\n%s", cli[i]);
				
				System.out.printf("\nDeseja atualizar o email? [S/N] ");
				atualizaEmail = clientes.next().charAt(0);
				
				if(atualizaEmail == 'S') {
					System.out.printf("Digite o novo e-mail do cliente: ");
					email = clientes.next();
					
					cli[i].atualizarEmail(email);
					System.out.printf("Email alterado com sucesso! Novo e-mail: %s");
				}
			}
		}

	}

}