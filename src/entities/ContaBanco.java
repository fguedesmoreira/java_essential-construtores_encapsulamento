package entities;

public class ContaBanco {

	private static final double TAXA = 5.0;

	private int numero;
	private String nomeTitular;
	private double saldo;

	public ContaBanco(int numero, String nomeTitular, double depositoInicial) {
		this.numero = numero;
		this.nomeTitular = nomeTitular;
		//this.saldo = depositoInicial;
		deposita(depositoInicial);
	}

	public ContaBanco(int numero, String nomeTitular) {
		this.numero = numero;
		this.nomeTitular = nomeTitular;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {
		this.saldo -= (valor + TAXA);
	}

	public String toString() {
		return "Conta " + numero + ", Titular: " + nomeTitular + ", Saldo: R$ " + String.format("%.2f", saldo);
	}

}