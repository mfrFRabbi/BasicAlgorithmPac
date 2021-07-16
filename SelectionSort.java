public class SelectionSort{
	static void selectionSort(int[] arr){
		for(int i = 0; i<arr.length - 1;i++){
			int minIndex = i;
			for(int j = i+1; j<arr.length;j++){
				if(arr[j]<arr[minIndex]){
					minIndex = j;
				}
			
			}
		   int temp = arr[minIndex];
		   arr[minIndex] = arr[i];
		   arr[i] = temp;
		}
	}
	static void printArry(int[] arr){
		for(int i: arr){
			System.out.print(" "+i);
		}
	}
	public static void main(String[] args){
		int[] arr = {9,8,7,4,3,2};
		printArry(arr);
		System.out.println();
		selectionSort(arr);
		printArry(arr);
	}
	
}