package JavaOrientaçãoAObjetos;

public class Poupança extends Conta {

	public Poupança(int agencia, int numero) {
		super(agencia, numero);
	}
	
	public double sacar(double valor) {
		// TODO Auto-generated method stub
			if (verificaSaque(valor) == true) {
				System.out.println("Saque efetuado com sucesso");
				this.saldo -= valor;
			}else {
				System.out.println("Saldo insuficiente");
			}
		return saldo;
	}
}
