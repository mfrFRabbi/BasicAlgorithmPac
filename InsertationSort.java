public class InsertationSort{
   static void insertationSort(int[] arr){
	  for(int i =1; i<arr.length; i++){
		 int key = arr[i];
		 int j = i-1;
		
		while((j>= 0) && (arr[j]>key)){
			arr[j+1] =arr[j];
			j =j-1;
		}
		arr[j+1] = key;
	 }
   }
  
   static void printArray(int[] arr){
	   for(int i: arr){
		   System.out.print(" "+i);
	   }
   }
  
   public static void main(String[] args){
	   int[] arr = {9,8,7,3,2,1,1};
	   printArray(arr);
	   System.out.println();
	   insertationSort(arr);
	   printArray(arr);
   }
  
}