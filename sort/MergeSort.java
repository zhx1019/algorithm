package algorithm;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,7,2,5,5,11};
		int[] b = new int[a.length];
		mergeSort(a,0,a.length - 1,b);
		for(int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}

	}
	
	static void mergeSort(int[] a, int l, int r,int[] b)
	{
		
		if(l < r)
		{
			int mid = (l + r) / 2;
			mergeSort(a,l,mid,b);
			mergeSort(a,mid+1,r,b);
			Merge(a,l,mid,r,b);
			
		}
	}
	static public void Merge(int[] a, int left, int mid, int right, int[] b)
	{
		int p = 0;
		int i = left;
		int j = mid+1;
		while(i <= mid && j <= right)
		{
			if(a[i] <= a[j])
			{
				b[p++] = a[i++];
			}
			else
			{
				b[p++] = a[j++];
			}
		}
		
		while(i <= mid)
		{
			b[p++] = a[i++];
		}
		
		while(j <= right)
		{
			b[p++] = a[j++];
		}
		
		for(p = 0,i = left; i <= right; i++)
		{
			a[i] = b[p++];
		}
	}

}
