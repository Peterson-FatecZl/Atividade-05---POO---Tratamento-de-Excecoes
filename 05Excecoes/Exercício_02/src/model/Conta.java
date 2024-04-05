package model;

public class Conta {

	private int agencia;
	private int codigo;
	private int saldo;
	private float limite;
	
	//Construtores
	public Conta() {
		super();
	}

	//Getters and Setters
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	//Métodos
	public void deposita(float deposito) {
		this.saldo += deposito;
	}
	
	public void saca(float saque) throws Exception {
		float saqueComLimite = (this.saldo + this.limite);
		
		if(saque > saqueComLimite) {
			throw new Exception("Valor indisponível para Saque, o valor maximo para saque com limite é " + saqueComLimite);
		}else {
			this.saldo -= saque;
		}
		
	}
	





}
