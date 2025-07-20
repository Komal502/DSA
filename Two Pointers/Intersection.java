import java.util.*;
class Intersection{
	public static int[] intersection(int[] arr1,int[] arr2)
	{
		int[] visited=new int[Math.max(arr1.length,arr2.length)];
		int[] ans=new int[Math.min(arr1.length,arr2.length)];
		int i,idx=-1;
		for(i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(visited[j]==0 && arr1[i]==arr2[j])
				{
					ans[++idx]=arr1[i];
					visited[j]=1;
					break;
				}
				if(arr2[j]>arr1[i])
					break;
			}
		}
		return Arrays.copyOfRange(ans,0,idx+1);
	}
	public static int[] intersection2(int[] arr1,int[] arr2)
	{
		int i=0;
		int j=0,idx=-1;
		int ans[]=new int[Math.max(arr1.length,arr2.length)];
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]==arr2[j])
			{
				ans[++idx]=arr1[i];
				i++;
				j++;
			}else if(arr1[i]<arr2[j])
			{
				i++;
			}else{
				j++;
			}
		}
		return Arrays.copyOfRange(ans,0,idx+1);
	}
	public static void main(String args[])
	{
		int arr1[]={1,2,2,3,3,4,5,6};
		int arr2[]={2,3,3,5,6,6,7};
		int ans[]=intersection2(arr1,arr2);
		for(int i=0;i<ans.length;i++)
		{
			System.out.println(ans[i]);
		}
	}
}