package _15_voting_booth;

import javax.swing.JOptionPane;

public class VOTINGBOOTH {
public static void main(String[] args) {
	String userInput=JOptionPane.showInputDialog(null, "HOW OLD ARE YOU MY CHILD???");
	int age= Integer.parseInt(userInput);
	
	if (age>17) {
		JOptionPane.showInputDialog(null, "WHO SHALL BE THE NEXT PRESIDENT?");
	} else {
		JOptionPane.showMessageDialog(null, "NO ONE CARES WHAT YOU THINK MY CHILD!");
	}
}
}
