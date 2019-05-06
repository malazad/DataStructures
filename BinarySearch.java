
public class BinarySearch {
	
	private int n_first=0,n_last,n_mid;
	public String Find(int[] array,int number){
		
		n_last = array.length;
		while(n_first != n_last){
			
			n_mid = (n_first+n_last)/2;
			System.out.println(n_first);
			System.out.println(n_last);
			System.out.println(n_mid);
			if(array[n_mid] == number)
				return String.format("The index is %d.",n_mid);
				
			else if (array[n_mid] > number)
				n_last = n_mid;
				
			else if (array[n_mid] < number)
				n_first = n_mid+1;
				
		}
		
		return String.format("Not Found!.");
	}
}
