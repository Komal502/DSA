import java.util.*;
class UnionArr{
	public static int[] union(int[] arr1, int[] arr2) {
    int unionArr[] = new int[arr1.length + arr2.length];
    int i = 0, j = 0, idx = -1;

    while (i < arr1.length && j < arr2.length) {
        if (arr1[i] < arr2[j]) {
            if (idx == -1 || unionArr[idx] != arr1[i]) {
                unionArr[++idx] = arr1[i];
            }
            i++;
        } else {
            if (idx == -1 || unionArr[idx] != arr2[j]) {
                unionArr[++idx] = arr2[j];
            }
            j++;
        }
    }

    while (i < arr1.length) {
        if (idx == -1 || unionArr[idx] != arr1[i]) {
            unionArr[++idx] = arr1[i];
        }
        i++;
    }

    while (j < arr2.length) {
        if (idx == -1 || unionArr[idx] != arr2[j]) {
            unionArr[++idx] = arr2[j];
        }
        j++;
    }

    // Return full array, but caller should only use first (idx + 1) elements
    return unionArr;
}

	public static void main(String args[])
	{
		int[] arr1={1,1,2,3,4,5};
		int[] arr2={2,3,4,4,5,6};
		int unionArr[]=union(arr1,arr2);
		System.out.println("hi");
		for(int i=0;i<unionArr.length;i++)
		{
			System.out.println(unionArr[i]);
		}
	}
}