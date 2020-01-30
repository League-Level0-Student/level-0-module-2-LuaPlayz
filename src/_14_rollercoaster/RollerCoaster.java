package _14_rollercoaster;

import javax.swing.JOptionPane;

public class RollerCoaster {
public static void main(String[] args) {
	String userInput=JOptionPane.showInputDialog(null, "WHAT HEIGHT ARE YOU???");
	int height = Integer.parseInt(userInput);
	
	if (height>47) {
	JOptionPane.showMessageDialog(null, "YOU MAY GO ON LE ROLLERCOASTER!!!");	
	} else {
		JOptionPane.showMessageDialog(null, "YOU ARE NOT WORTHY OF GOING ON THIS MAGESTIC ROLLERCOASTER!!! COME BACK ONCE YOU GROW MORE!!!");
		
		
	}
	}
	}


