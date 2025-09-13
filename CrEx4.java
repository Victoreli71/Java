import javax.swing.JOptionPane;

public class Ex4 {

	public static void main(String[] args) {
		double soma = 0, n1;
		int i;
		for(i=1;i<=10;i++) {
			n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero :"));
			soma = soma + n1; //acumulador
		}
		JOptionPane.showMessageDialog(null, "A somatória é :" + soma);
	}

}
