public class QuickSort{
	static void swaping(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}	
	
	static int partition(int[] arr,int l,int h){
		int pivot = arr[h];
		int i = l-1;
		for(int j = l;j<h ;j++){
			if(arr[j]<=pivot){
				i++;
				swaping(arr,i,j);
			}
		}
		swaping(arr,i+1,h);
		return i+1;
	}
	static void quickSort(int[] arr,int l,int h){
		if(l<h){
		int p = partition(arr,l,h);
		quickSort(arr,l,p-1);
		quickSort(arr,p+1,h);
		}

	}
	static void printArry(int[] arr){
		for(int i: arr){
			System.out.print(" "+i);
		}
		System.out.println();
	}
	public static void main(String[] args){
		int[] arr = {4,4,6,1,3};
		printArry(arr);
		quickSort(arr,0,arr.length-1);
		printArry(arr);
		
	}
}