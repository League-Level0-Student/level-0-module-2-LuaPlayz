package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
public static void main(String[] args) {
	Random random = new Random();
	int number1 = random.nextInt(10);
	int number2 = random.nextInt(10);
	int number3 = random.nextInt(10);
	int number4 = random.nextInt(10);
	int number5 = random.nextInt(10);
	JOptionPane.showMessageDialog(null, number1+ " "+number2+ " "+number3+ " "+ number4+ " "+ number5);
}
}
