package algorithm;

public class Maopao {
	
	public void mp(int[] array)
	{
		int k;
		for(int i = 0; i < array.length - 1; i++)
		{
			for(int j = 0; j < array.length - i - 1; j++)
			{
				if(array[j] > array[j+1])
				{
					k = array[j];
					array[j] = array[j+1];
					array[j+1] = k;
				}
			}
		}
		
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
		
		/*for(int i = 0; i < array.length - 1; i++)
		{
			for(int j = i + 1; j < array.length - 1; j++)
			{
				if(array[j] < array[j+1])
				{
					k = array[j];
					array[j] = array[j+1];
					array[j+1] = k;
				}
			}
		}
		
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}*/
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maopao mm = new Maopao();
		int a[] = {3,9,87,67,4,65};
		mm.mp(a);
	}

}
