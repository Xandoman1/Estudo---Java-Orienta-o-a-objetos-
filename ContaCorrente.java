package JavaOrientaçãoAObjetos;

public class ContaCorrente extends Conta implements Tributavel{

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero); //não precisa do super, mas se eu quiser chamar um construtor específico, tenhoque chamar os parametros
	}
	
	//@Override //anotação para dizer que estava escrevendo em cima do méteodo da classe mãe
	public double sacar(double valor) {
		// TODO Auto-generated method stub
		double valorSaque = valor - 0.2;
			if (verificaSaque(valorSaque) == true) {
				System.out.println("Saque efetuado com sucesso");
				this.saldo -= valorSaque;
			}else {
				System.out.println("Saldo insuficiente");
			}
		return saldo;
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.2;
		
	}
	
}


