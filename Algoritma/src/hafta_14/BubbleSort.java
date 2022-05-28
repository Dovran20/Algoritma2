package hafta_14;

public class BubbleSort {
	
	public void bubbleSort(int []array) {
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length-i-1; j++) {
				if(array[j]>array[j+1]) {
					//swapp(array,i,j);
					int tmp=array[j];
					array[j]=array[j+1];
					array[j+1]=tmp;
				}
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
		
		BubbleSort object=new BubbleSort();
		object.bubbleSort(array);
		object.printArray(array);

	}

}
