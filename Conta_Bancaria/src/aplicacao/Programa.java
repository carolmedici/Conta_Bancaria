package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import modelo.excecao.Excecao;

import entidade.Conta;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		try {
			System.out.println("Insira os dados da conta:");
			System.out.print("Número: ");
			int numero = sc.nextInt();
			System.out.print("Correntista: ");
			String correntista = sc.next();
			System.out.println("Saldo inicial: ");
			double saldo = sc.nextDouble();
			System.out.println("Limite de saque: ");
			double limiteSaque = sc.nextDouble();
			
			Double saque = 0.00 ;
			
			Conta conta = new Conta(numero, correntista, saldo, limiteSaque, saque);
			
			System.out.println();
			System.out.println("Insira a quantia do saque: ");
			 saque = sc.nextDouble();
			conta.sacaDinheiro(saque);
			System.out.println("Novo saldo: " + conta.getSaldo());
		
		}catch (Excecao e) {
			System.out.println("Erro inesperado: " + e.getMessage());
		}
			
		sc.close();
	}
}
