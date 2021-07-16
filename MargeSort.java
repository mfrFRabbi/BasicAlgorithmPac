public class MargeSort{
	static void margeSort(int[] array,int l,int r,int m){
		int n1 = m-l+1;
		int n2 = r-m;
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		for(int i = 0; i<n1;i++){
			L[i] = array[l+i];
		}
		for(int i = 0; i<n2;i++){
			R[i] = array[m+i+1];
		}
		
		int i = 0,j = 0,k = l;
		while(i<n1 && j<n2){
			if(L[i]<= R[j]){
				array[k] = L[i];
				i++;
			}else{
			  array[k] = R[j];
			  j++;
			}
			k++;
		}
		while(i<n1){
			array[k] = L[i];
			i++;
			k++;
		}
		while(j<n2){
			array[k] = R[j];
			j++;
			k++;
		}
	}
	public static void divideArray(int[] array,int l,int r){
		if(l<r){
			int m = (l + r) >>>1; //or int m = l+(r-l)/2;
			divideArray(array,l,m);
			divideArray(array,m+1,r);
			margeSort(array,l,r,m);
		}
	}
	static void printArrays(int[] array){
		for(int i: array){
			System.out.print(i +" , ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		int array[] = {5,6,7,1,3,2};
		printArrays(array);
		
		divideArray(array,0,array.length -1);
		
		printArrays(array);
	}
}