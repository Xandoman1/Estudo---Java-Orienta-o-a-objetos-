package JavaOrientaçãoAObjetos;

public abstract class Conta extends Cliente { //não posso instanciar objeto dessa classe
	
	private Cliente titular;
	private int agencia;
	private int numero;
	protected double saldo;
	private static int total; //para o total ser somado em relação a classe, e não somente ao objeto, senão fica tudo 1
	//STATIC indica que é DA CLASSE e não só do objeto, nem podemos usar THIS
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		this.saldo = 0;
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Agência: " + agencia + " Conta: " + numero);
		
	}
	
	//public Conta(int agencia, int numero) {
		//this(titular, agencia, numero);
	//} para usara mais de um construtor caso não precise de todas as infos

	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public abstract double sacar(double valor);
	
	public boolean verificaSaque(double valor) {
		if (this.saldo >= valor) {
			return true;
		} else {
			return false;
		}
	}

	
	public boolean transfere(double valor, Conta destino){
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
			
		} else {
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int novoNumero){
		if (novoNumero > 0) { 
			this.numero = novoNumero;
		} else {
			System.out.println("Número inválido");
		}
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int NovaAgencia) {
		this.agencia = NovaAgencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		System.out.println("Total de contas: " + total);
		return Conta.total; //não precisa usar o this
	}
		
}
