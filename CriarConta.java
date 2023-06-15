package JavaOrientaçãoAObjetos;

public class CriarConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta(6476, 68788);
		Conta segundaConta = new Conta(4787, 9001);
		Conta terceiraConta = new Conta(6667, 78574);
		Cliente xandao = new Cliente();
		Cliente xandao2 = new Cliente();
		Cliente xandao3 = new Cliente();
		
		primeiraConta.setTitular(xandao);
		segundaConta.setTitular(xandao2);
		terceiraConta.setTitular(xandao3);
		
		//System.out.println("Total de contas: " + Conta.getTotal());
		Conta.getTotal();
		
		segundaConta.getTitular().setNome("Xandão Dois");
		String nome = segundaConta.getTitular().getNome();
		System.out.println(nome);
		
		primeiraConta.setNumero(678);
		primeiraConta.deposita(400);
		System.out.println("Saldo: " + primeiraConta.getSaldo());
		System.out.println("Conta Nº " + primeiraConta.getNumero());
		
		boolean transferiu = primeiraConta.transfere(150, segundaConta);

		if(transferiu) {			
			System.out.println("Transferência efetuada com sucesso");
			System.out.println("Saldo atual: " + primeiraConta.getSaldo());
		} else {
			System.out.println("Saldo insuficiente");
		}
		
		
		
	}
	
}
