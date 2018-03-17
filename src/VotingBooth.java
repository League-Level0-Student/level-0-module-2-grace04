import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String Ans = JOptionPane.showInputDialog("How old are you?");
		int x = Integer.parseInt(Ans);
		if(x>=18) {
			String Bns = JOptionPane.showInputDialog("Who should the next president be?");
		}
		else {JOptionPane.showMessageDialog(null, "Nobody cares what you think.");
	}
	}
}
