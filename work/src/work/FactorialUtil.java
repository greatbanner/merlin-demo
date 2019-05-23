package work;

public class FactorialUtil {

	
	public int calculateFactor(int inputNumber) {			
		return inputNumber == 0 ? 1 :  calculateFactor(inputNumber - 1) * inputNumber ;
		
	}
}
