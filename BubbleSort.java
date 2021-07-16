public class BubbleSort{
	static void bubbleSort(int[] arr){
		for(int i = 0; i<arr.length -1; i++){
			for(int j = 0; j<arr.length -i -1;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	static void printArray(int[] arr){
		for(int i: arr){
			System.out.print(" "+i);
		}
	}
	public static void main(String[] args){
		int[] arr = {5,7,8,9,10,0};
		printArray(arr);
		bubbleSort(arr);
		System.out.println();
		printArray(arr);
		
	}
}