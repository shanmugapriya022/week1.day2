package week1.day2;

import java.util.Arrays;

public class FindCharCount 
{

	public static void main(String[] args)
	{
    String str="happy";
	char ch='p';
	int count=0;
	char[] charArray=str.toCharArray();
	Arrays.sort(charArray);
	for(int i=0;i<charArray.length;i++)
	{
		if(charArray[i]==ch)
		{
			count++;
		}
		
    }
	
	System.out.println("Count of given char is" +count);
	}
}
	
