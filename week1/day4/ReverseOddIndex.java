package week1.day4;

public class ReverseOddIndex {

	public static void main(String[] args) {
		String input="I am a software tester";
        String[] words=input.split(" ");
        String result="";
        for (int i=0;i<words.length;i++){
            if(i%2!=0){
                String reversed = new StringBuilder(words[i]).reverse().toString();
                result+=reversed+" ";
            }
            else{
                result+=words[i]+" ";
            }
        }
        System.out.println(result.trim());
	}
}
