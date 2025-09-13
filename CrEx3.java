import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
		double a, b, c;
		a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A :"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B :"));
		c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de C :"));
		
		if((a<b+c) && (b<a+c) && (c<a+b)) {
			JOptionPane.showMessageDialog(null, "Estes valores formam um triangulo");
			if((a==b) && (b==c)) {
				JOptionPane.showMessageDialog(null, "Triangulo equilatero");
			}
			else {
				if((a==b) || (b==c) || (a==c)) {
					JOptionPane.showMessageDialog(null, "Triangulo isosceles");
				}
				else {
					JOptionPane.showMessageDialog(null, "Triangulo escaleno");
				}
			}
		}
		
		else {
			JOptionPane.showMessageDialog(null, "estes valores não formam um triangulo");
		}
	} 	
}
