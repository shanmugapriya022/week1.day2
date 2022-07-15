package week1.day2;

import java.util.Arrays;

public class FindMinMax {

	public static void main(String[] args) {
		int[] nums = {22, 3981, -19, 82, 0, 45, 37};
		int l = nums.length;
		Arrays.sort(nums);
		System.out.println("sorting numbers");
		for(int i=0;i<nums.length;i++)
		{
			System.out.println(nums[i]);
		}
		System.out.println("Minimum value:"+ nums[0]);
		
		System.out.println("Maximum value:"+ nums[l-1]);
		
		
		}
	}

