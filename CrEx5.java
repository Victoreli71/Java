import javax.swing.JOptionPane;

public class Ex5 { //exemplo while

	public static void main(String[] args) {
		double media, soma = 0; //soma vai iniciar com 0 
		int num, qtde = 0;
		char resp = 's';  // vai iniciar com s
		while (resp == 's' || resp == 'S') {
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero :"));
			soma = soma + num;
			qtde = qtde + 1;
			
			resp = JOptionPane.showInputDialog("Deseja continuar").charAt(0);
		}
		media = soma/qtde;
		
		JOptionPane.showMessageDialog(null, "A média dos numeros digitados é: " + media);
		
	}
	

}
