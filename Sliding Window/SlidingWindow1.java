import java.util.*;
class SlidingWindow1
{
	public static void main(String args[])
	{
		int arr[]={2,3,5,2,9,7,1};
		int i=0,j=0;
		int sum=0;
		int maxSum=-1;
		int n=3;
		while(j<arr.length)
		{
			if(j-i+1>n)
			{
				maxSum=Math.max(maxSum,sum);
				sum-=arr[i];
				i++;
				sum+=arr[j];
				j++;
			}else{
				sum+=arr[j];
				j++;
			}
		}
		System.out.println("Longest SubArray="+maxSum);
	}
}