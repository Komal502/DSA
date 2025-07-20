class UnionArr{
	public static int[] union(int[] arr1,int[] arr2)
	{
		int unionArr[]=new int[arr1.length+arr2.length];
		int i=0,j=0,idx=-1;
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				if(idx==-1 || unionArr[idx]!=arr1[i])
				{
					unionArr[++i]=arr1[i];
				}
				i++;
			}else{
				if(idx==-1 || unionArr[idx]!=arr2[j])
				{
					unionArr[++i]=arr2[j];
				}
				j++;
			}
		}
		return Arrays.copyOfRange(unionArr,0,idx+1);
	}
	public static void main(String args[])
	{
		int[] arr1={1,1,2,3,4,5};
		int[] arr2={2,3,4,4,5,6};
		int unionArr[]=union(arr1,arr2);
		for(int i=0;i<unionArr.length;i++)
		{
			System.out.println(unionArr[i]);
		}
	}
}