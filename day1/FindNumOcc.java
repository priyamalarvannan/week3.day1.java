package week3.day1;

public class FindNumOcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count=0;
		String name="Priya Malarvannan";
		char[] charArray=name.toCharArray();
		for(int i=0;i<charArray.length;i++)
		{
			if(charArray[i]=='a')
				count=count+1;
		}
		System.out.println(" the number of a in my name"+count);
	}
	

}
