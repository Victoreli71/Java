package exercicios;

public class Caneta02 {
	public String modelo;
	private float ponta;
	private boolean tampada;
	private String cor;
	
	
	public  Caneta02(String m, String c, float p  ) {
		this.modelo = m;
		this.cor = c;
		this.ponta = p;
		this.tampar();
		
		
	} //metodo construtor fim
	
	public String getModelo( ) {
		return this.modelo; 
	}
	public void setModelo(String m) {
		this.modelo = m;
	}
	public float getPonta() {
		return this.ponta;
	}
	public void setPonta(float p) {
		this.ponta = p;
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	public void status () {
		System.out.println("SOBRE A CANETA: ");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("Cor: " + this.cor);
		System.out.println("Tampada: " + this.tampada);
	}

}
