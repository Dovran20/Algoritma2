package hafta_14;

public class InsertionSort {
	
	
	public void insertionSort(int array[]) {
		
		
		for (int i = 1; i < array.length; ++i) {
			int key=array[i];
			int j=i-1;
			while(j >= 0 && array[j]>key) {
				array[j+1]=array[j];
				j=j-1;
			}
			array[j+1]=key;
		}
	}
	
	public void printArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
	}

	public static void main(String[] args) {

        int array[]= {4,2,1,56,3,2,1};
		
		InsertionSort object=new InsertionSort();
		object.insertionSort(array);
		object.printArray(array);
	}

}
