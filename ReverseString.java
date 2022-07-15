package week1.day2;

public class ReverseString 
{
	public static void main(String[] args)
	{
		String str="hello";
		char[] ch1= str.toCharArray();
		System.out.println("length of the string is 5");
		for(int i=ch1.length-1;i>=0;i--)
		{
			System.out.println(ch1[i]);
		}
	}

}
