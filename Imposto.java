package JavaOrientaçãoAObjetos;

public class Imposto implements Tributavel{

	private double total;
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.total += valor;
	}
	
	public double getValorImposto() {
		return total;
	}
	
}
