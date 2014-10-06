package algorithm;

public class QuickSort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] a = {11, 2, 5, -10, -4, 5, -2, 5};
//		int[] a = {5, 5, 5, 5, 5, 5, 5, 5};
		int[] a = {3,7,2,5,5,11};
		QuickSort qs = new QuickSort();
		qs.qSort(a,0,a.length - 1);
		for(int i = 0; i < a.length; i++)
			System.out.println(a[i]);
				
	}
	
	/*int huafen(int[] a, int l, int u)
	{
		int i = l;
		int last = a[u];
		for(i = l; i < u; i++)
		{
			if(a[i] > last)
			{
				int t = a[i];
				a[i] 
			}
		}
	}*/
	void insertSort(int[] a, int l, int r)
	{
		for(int i = l + 1; i < r; i++)
		{
			int g = a[i];
			int j = 0;
			for(j = i; j > l && a[j -1] > g; j--)
			{
				/*int t = a[j - 1];
				a[j - 1] = g;
				g = t;*/
				a[j] = a[j - 1];
			}
			a[j] = g;
		}
	}
	void qSort(int[] a, int l, int u)
	{
		int i = l;
		int j = u - 1;
		int Pivot = a[u];
		if(l + 2 > u)
		{
			insertSort(a,l,u-l+1);
			return;
		}
		for(;;)
		{
			while(i < u && a[i] <= Pivot )
			{
				i++;
			}
			while(j > l && a[j] >= Pivot )
			{
				j--;
			}
			if(i < j)
			{
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
			else
			{
				break;
			}
		}
		
		int tmp = a[u];
		a[u] = a[i];
		a[i] = tmp;
		if(i > 1)
			qSort(a,l,i-1);
		if(i < u - 1)
			qSort(a,i+1,u);
		
	}

}
