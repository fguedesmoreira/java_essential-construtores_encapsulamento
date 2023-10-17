package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBanco;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		// Abertura da conta
		System.out.print("Informe o número da conta: ");
		int numeroDaConta = sc.nextInt();

		sc.nextLine();

		System.out.print("Informe o nome do titular da conta: ");
		String nomeDoTitular = sc.nextLine();

		System.out.print("Deseja realizar um depósito inicial (S/N)? ");
		char temDepositoInicial = sc.next().charAt(0);

		ContaBanco conta;

		if (temDepositoInicial == 's' || temDepositoInicial == 'S') {
			System.out.print("Informe o valor do depósito inicial: R$ ");
			double valorDeposito = sc.nextDouble();

			conta = new ContaBanco(numeroDaConta, nomeDoTitular, valorDeposito);
		} else {
			conta = new ContaBanco(numeroDaConta, nomeDoTitular);
		}

		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(conta);
		System.out.println();

		// Depósito
		System.out.print("Informe o valor do depósito: R$ ");
		double valorDeposito = sc.nextDouble();

		conta.deposita(valorDeposito);

		System.out.println("Dados da conta atualizada:");
		System.out.println(conta);
		System.out.println();

		// Saque
		System.out.print("Informe o valor do saque: R$ ");
		double valorSaqe = sc.nextDouble();

		conta.saca(valorSaqe);

		System.out.println("Dados da conta atualizada:");
		System.out.println(conta);
		System.out.println();

		sc.close();

	}

}