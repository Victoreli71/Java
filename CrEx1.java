import javax.swing.JOptionPane;

public class Ex1 {
	public static void main(String[] args) {
		int num;
		num = Integer.parseInt(JOptionPane.showInputDialog("Entre com um numero interiro :"));
		if (num%2==0) {
			JOptionPane.showMessageDialog(null, "O numero :" + num + "é par");
		}
	}
	
}
