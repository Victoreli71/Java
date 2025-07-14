package exercicios;

public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	
	public void estadoAtual() {
		System.out.println("---------------------------------------");
		System.out.println("Conta:" + this.getNumConta());
		System.out.println("Dono:" + this.getDono());
		System.out.println("Tipo:" + this.getTipo() );
		System.out.println("Saldo:" + this.getSaldo());
		System.out.println("Status:" + this.getStatus());
	}
	
	public ContaBanco() {
		saldo = 0;
		status = false;
	}
	
	public void depositar(float v ) {
		if (this.getStatus()) {
			//this.saldo = this.saldo + v;
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Deposito realizado com sucesso na conta de" + this.getDono());
		} else {
			System.out.println("impossivel depositar em uma conta fechada");
		}
		
	}
	public void sacar(float v ) {
		if (this.getStatus()) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado na conta de" + this.getDono());
			} else {
				System.out.println("Saldo insuficiente para saque");
			}
		} else {
			System.out.println("impossivel sacar de uma conta fechada");
		}
	}
	public void pagarMensal() {
		int v = 0;
		if (this.getTipo() == "CC") {
			v = 12;
		} 
		else if (this.getTipo() == "CP") {
			v = 20;
		}
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso ! por" + this.getDono());
		} else {
			System.out.println("Impossivel pagar uma conta fechada !");
		}
		
	}
	
	

	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if ( t == "CC" ) {
			this.setSaldo(50);
		}
		else if (t == "CP") {
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso");
	}
	
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("conta não pode ser fechada ainda, pois ainda tem dinheio ");
		} else if (this.getSaldo() < 0 ) {
			System.out.println("conta não pode ser fechada, pois ainda tem debitos ");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso ");
		}
	}
	
	
	public int getNumConta() {
		return this.numConta;
	}
	public void setNumConta(int n) {
		this.numConta = n;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return this.dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	public void status () {
		System.out.println("Numero da sua conta é: " + this.getNumConta());
		System.out.println("tipo da conta: " + this.getTipo());
		System.out.println("titular da conta: " + this.getDono());
		System.out.println("saldo da conta: " + this.getSaldo());
		System.out.println(" Sua conta esta : " + this.status);
	}

}
