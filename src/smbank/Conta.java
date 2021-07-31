package smbank;

public class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private String titular;
	
	
	public void depositar (double valor) {
		this.saldo += valor;
	}
	public void sacar (double valor) {
		if(this.saldo>=valor) {
			 this.saldo -= valor;
		}		        
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	
	

}
