package week1.day2;

public class PrintFibonacciSeries {

	public static void main(String[] args) {
		int firstNumber=1;
		int secondNumber=1;
		int thirdNumber=1;
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		for (int a = 0; a <=8 ; a++) {
			firstNumber=secondNumber;
			secondNumber=thirdNumber;
			thirdNumber=firstNumber+secondNumber;
			System.out.println(thirdNumber);
		}

	}

}
