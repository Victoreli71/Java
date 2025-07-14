package exercicios;

public class Principal {
	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.tampar();
		c1.carga = 0;
		c1.modelo = "Bic";
		c1.status();
		c1.rabiscar();
		
		Caneta c2 = new Caneta();
		c2.modelo = "Asus";
		c2.cor = "Verde";
		c2.ponta = 1.0f;
		c2.carga = 2;
		c2.destampar();
		c2.rabiscar();
	}


}
