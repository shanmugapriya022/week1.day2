package week1.day2;

import java.util.Arrays;

public class FindDups {
	public static void main(String[] args)
	{
		int[] num = {5,7,8,9,0,12,89,5,9,6,3,12,-1};
		Arrays.sort(num);
		for(int i=0;i<num.length-1;i++)
		{
			int a1=num[i];
			int a2=num[i+1];
					if(a1==a2)
					{
						System.out.println(a1);
						
					}
		}
	}

}
