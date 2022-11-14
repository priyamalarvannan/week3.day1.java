package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		String name1="post";
		String name2="stop";
		char[] ch1 = name1.toCharArray();
		char[] ch2 = name2.toCharArray();
	int length1=name1.length();
	int length2=name2.length();
	if(length1==length2)
	{
		System.out.println("the length is same");
	}
	 Arrays.sort(ch1);
	 Arrays.sort(ch2);
	 if(Arrays.equals(ch1, ch2))
			 {
		 System.out.println("anagram");
			 }
	 else
	 {
		 System.out.println("not a anagram");
	 }
		 
	}

}
