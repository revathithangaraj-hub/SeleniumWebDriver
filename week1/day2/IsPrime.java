package week1.day2;

public class IsPrime {
	public static void main(String[] args) {
		int num=13;
		boolean value=true;
		if(num<=1) {
			value= false;
		}
		else {
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					value=false;
					break;
				}
			}
		}
		if (value) {
			System.out.println(num+ " is a prime number.");
		}
		else {
			System.out.println(num+ " is not a prime number.");
		}
	}
}