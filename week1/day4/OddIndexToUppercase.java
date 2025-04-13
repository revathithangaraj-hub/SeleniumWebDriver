package week1.day4;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		String text="changeme";
		String result="";
		for(int i=0;i<text.length();i++) {
			char ch=text.charAt(i);
			if(i%2!=0) {
				result+=Character.toUpperCase(ch);
			}
			else {
				result+=ch;
			}
		}
		System.out.println("The Result is: "+result);
	}

}
