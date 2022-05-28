package hafta_14;


public class SelectionSort {
	
	public void selectionSort(int array[]) {
		for (int i = 0; i < array.length-1; i++) {
			int minIndex=i;
			for (int j = i+1; j < array.length; j++) {
				if(array[minIndex]>array[j]) {
					minIndex=j;
				}
				swapp(array,i,minIndex);
			}
				
		}
			
		}
	
	public static void swapp(int array[],int i,int j) {
		if(i!=j) 
		{
			int tmp=array[i];
			array[i]=array[j];
			array[j]=tmp;
		}
		
	}
		
	public void printArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		int array[]= {4,2,1,56,3,2,1};
		
		SelectionSort object=new SelectionSort();
		object.selectionSort(array);
		object.printArray(array);

	}

}
