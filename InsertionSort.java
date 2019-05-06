
public class InsertionSort {
	
	private int i=1,j=0,temp;
	
	public void sort(int[] array,int array_length)
	{
		while(i < array_length)
		{
			j = i-1;
					while(j >= 0 && array[j] > array[j+1])
					{
						temp = array[j];
						array[j] = array[j+1];
						array[j+1] = temp;
						j--;
					}
			i++;
		}
	}
	
}
