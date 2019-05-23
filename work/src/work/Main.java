package work;

import java.math.BigInteger;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputNumber = Integer.parseInt(JOptionPane.showInputDialog("Please enter your number"));
		JOptionPane.showMessageDialog(null,
				"The factorial of " + inputNumber + " is " + calculateFactorial(inputNumber));
	}

	public static int sumDigits(int inputNumber) {

		String value = String.valueOf(inputNumber);
		int sum = 0;
		for (int i = 0; i <= value.length(); i++) {
			sum += Integer.parseInt(value.indexOf(i));
		}

	}

	public static int calculateFactorial(int inputNumber) {
		return inputNumber == 0 ? 1 : calculateFactorial(inputNumber - 1) * inputNumber;
	}

	private static String lastTenDigits(int number) {
		BigInteger series = BigInteger.ZERO;
		for (int i = 1; i < number; i++) {
			series = series.add(BigInteger.valueOf(i).pow(i));
		}
		String lastTenDigits = series.toString();
		return lastTenDigits.substring(lastTenDigits.length() - 10);
	}

}
