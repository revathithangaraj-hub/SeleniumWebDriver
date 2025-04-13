package week1.day4;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1="stops";
		String str2="potss";
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (Arrays.equals(ch1,ch2)){
        	System.out.println("The given strings are anagrams.");
        	}
        else{
        	System.out.println("The given strings are not anagrams.");
        	}
        }
}
