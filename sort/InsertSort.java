package algorithm;

/*
 * 如果输入数组几乎是有序的，插入排序是很快的
 * 
 * */


public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-11, -2, -3, -10, -4, -7, -2, -5};
		int j;
		for(int i = 1; i < a.length; i++)
		{
			int g = a[i];
			for(j = i; j > 0 && a[j-1] > g; j--)
			{
				a[j] = a[j - 1];
			}
			a[j] = g;
		}
		for(int i = 0; i < a.length; i++)
		System.out.println(a[i]);
	}

}
