package algorithm;

public class HeapSort {
	static int size = 0;
	static int[] heap = new int[100];
	
	void buildHeap(int x)
	{
		int i,p;
		heap[++size] = x;
		heap[0] = Integer.MIN_VALUE;
		for( i = size;heap[p = i/2] > x  && i >= 1; i = p)
		{
			heap[i] = heap[i/2];
		}
		heap[i] = x;
//		System.out.println("heap" + i + " " + heap[i]);
	}
	
	int deleteMin()
	{
		int i, c;
		int t = heap[1];
		
//		System.out.println(heap[size]);
		int tmp = heap[size];
//		heap[size]= t;
//		System.out.println(t);
		size = size - 1;
		for(i = 1; 2 * i <= size; i = c)
		{
			c = 2 * i;
			if(heap[c+1] < heap[c])
			{
				c++;
			}
			
			if(tmp > heap[c])
			{
				heap[i] = heap[c];
			}
			else
			{
				break;
			}
		}
		heap[i] = tmp;
		return t;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {11, 22, 5, 10, -4, 5, 12, 5};
		HeapSort hs = new HeapSort();
		int [] v = new int[a.length];
		for(int i = 0; i < a.length; i++)
		{
			hs.buildHeap(a[i]);
		}
		
//		for(int i = 0; i <= a.length; i++)
//		{
//			System.out.println(heap[i]);
//		}
		
//		size = size + 1;
		for(int i = 0; i < a.length; i++)
		{
			v[i] = hs.deleteMin();
			System.out.println(v[i]);
		}
	}

}
