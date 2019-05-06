
public class SelectionSort {

	private int i=0,j,temp,min,index_of_min;
	
	public void sort(int[] array,int array_length){
		while(i<array_length)
		{
			min = array[i];
			index_of_min = i;
			for(j=i; j < array_length; j++)
			{
				if( array[j] < min)
				{
					min = array[j];
					index_of_min = j;
				}
			}
			
			temp = array[i];
			array[i] = array[index_of_min];
			array[index_of_min] = temp;
			i++;
		}
		
	}
}
