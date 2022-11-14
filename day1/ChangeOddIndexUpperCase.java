package week3.day1;

public class ChangeOddIndexUpperCase {
public static void main(String[] args) {
	String text="changeme";
	String ucase="";
	char[] ch1 = text.toCharArray();
	int length = ch1.length;
	for(int i=0;i<length;i++)
	{
		char ch=ch1[i];
		if(i%2 ==0)
		{
						ucase=ucase+Character.toUpperCase(ch);
			}
			else
			{
				 ucase=ucase+ch1[i];
			}
		}
		System.out.println(ucase);
	}

}