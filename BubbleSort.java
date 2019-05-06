
public class BubbleSort {

	private int i=0,j,temp,min,index_of_min;
		
		public void sort(int[] array,int array_length){
			for(i = array_length-1 ; i >= 0; i--){
				for(j = 0; j < i; j++){
					if(array[j] > array[j+1]){
						temp = array[j];
						array[j] = array[j+1];
						array[j+1] = temp;
					}
				}
			}
		}
}