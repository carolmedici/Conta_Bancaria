package entidade;

import modelo.excecao.Excecao;

public class Conta {
	private Integer numero;
	private String correntista;
	private Double saldo;
	private Double saque;
	private Double limiteSaque;
	
	public Conta(Integer numero, String correntista, Double saldo, Double limiteSaque, Double saque) {
		if(limiteSaque < saque ) {
			throw new Excecao("Limite de saque excedido");
		}
		
		this.saque = saque;
		this.numero = numero;
		this.correntista = correntista;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCorrentista() {
		return correntista;
	}

	public void setCorrentista(String correntista) {
		this.correntista = correntista;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	
	public Double getSaque() {
		return saque;
	}
	
	public void setSaque(Double saque) {
		this.saque = saque;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public void depositaDinheiro(double saldo) {
		this.saldo += saldo;
	}
	
	public void sacaDinheiro( double saque) {
		if(saque > limiteSaque ) {
			throw new Excecao("Limite de saque excedido");
		}
		if(saque > saldo) {
			throw new Excecao("Saldo insuficiente");
		}
		saldo -= saque;
	}
	
	}
