package JavaOrientaçãoAObjetos;

public class CriarConta {

	public static void main(String[] args) {
		
		ContaCorrente primeiraConta = new ContaCorrente(6476, 68788);
		Conta segundaConta = new Poupança(4787, 9001);
		ContaCorrente terceiraConta = new ContaCorrente(6667, 78574);
		Cliente xandao = new Cliente();
		Cliente xandao2 = new Cliente();
		Cliente xandao3 = new Cliente();
		Imposto i = new Imposto();
		i.registra(terceiraConta);
		
		
		
		primeiraConta.setTitular(xandao);
		segundaConta.setTitular(xandao2);
		terceiraConta.setTitular(xandao3);
		
		//System.out.println("Total de contas: " + Conta.getTotal());
		Conta.getTotal();
		
		segundaConta.getTitular().setNome("Xandão Dois");
		String nome = segundaConta.getTitular().getNome();
		System.out.println(nome);
		
		primeiraConta.deposita(400);
		primeiraConta.sacar(50);
		System.out.println("Saldo: " + primeiraConta.getSaldo());
		System.out.println("Conta Nº " + primeiraConta.getNumero());
		
		boolean transferiu = primeiraConta.transfere(150, segundaConta);

		if(transferiu) {			
			System.out.println("Transferência efetuada com sucesso");
			System.out.println("Saldo atual: " + primeiraConta.getSaldo());
		} else {
			System.out.println("Saldo insuficiente");
		}
		
		System.out.println(primeiraConta.getValorImposto());
		
		
	}
	
}
