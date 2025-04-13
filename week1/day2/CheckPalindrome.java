package week1.day2;

public class CheckPalindrome {

	public static void main(String[] args) {
		int num = 121;
        int original = num;
        int reversed = 0;
        for (int temp =num; temp> 0; temp /= 10) {
        	int digit = temp % 10;
            reversed = reversed * 10 + digit;
        }
        if (original == reversed) {
        	System.out.println(original + " is a palindrome.");
        }
        else {
            System.out.println(original + " is not a palindrome.");
        }
	}
}
