package extra;

import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
	String Ans = JOptionPane.showInputDialog("How tall are you in inches?");
	int x = Integer.parseInt(Ans);
	if(x>48) {
		JOptionPane.showMessageDialog(null, "You can go on the rollercoaster.");
	}
	else {JOptionPane.showMessageDialog(null, "You need to grow more first.");
}
}
}
