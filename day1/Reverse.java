package week3.day1;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Priya";
		char[] charArray=name.toCharArray();
		System.out.println(charArray);
		for(int i=charArray.length-1;i>=0;i--)
		{
			System.out.println(charArray[i]);
			
		}
		
	}

}
