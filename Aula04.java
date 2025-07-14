package exercicios;

public class Aula04 { 
	public static void main(String[] args) {
		Caneta02 c1 = new Caneta02("Nic", "Amarela", 0.4f);
		
		
		
		Caneta02 c2 = new Caneta02("TUTS", "Laranja", 1.5f);
		
		
		//*c1.setModelo("BIC");
		//c1.modelo = "BIC-acrilico";
		
		//c1.setPonta(0.5f);
		c1.status();
		c2.status();
		//System.out.println("Tenho uma caneta " + c1.getModelo() + " de Ponta: " + 
		//c1.getPonta());
	}
	

}
