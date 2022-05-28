package hafta_14;

public class MergeSort {
	
	public void mergeSort(int []array,int left,int right) {

		if(left<right) {
			int middle=left+(right-left)/2;
			mergeSort(array,left,middle);
			mergeSort(array,middle+1,right);
			
			merge(array,left,middle,right);
		}
		
	}
	
	static void merge(int a[], int beg, int mid, int end)    
	{    
	    int i, j, k;  
	    int n1 = mid - beg + 1;    
	    int n2 = end - mid;    
	      
	    int LeftArray[]=new int[n1], RightArray[]=new int[n2]; //temporary arrays  
	      
	    /* copy data to temp arrays */  
	    for (int i1 = 0; i1 < n1; i1++)    
	    LeftArray[i1] = a[beg + i1];    
	    for (int j1 = 0; j1 < n2; j1++)    
	    RightArray[j1] = a[mid + 1 + j1];    
	      
	    i = 0; /* initial index of first sub-array */  
	    j = 0; /* initial index of second sub-array */   
	    k = beg;  /* initial index of merged sub-array */  
	      
	    while (i < n1 && j < n2)    
	    {    
	        if(LeftArray[i] <= RightArray[j])    
	        {    
	            a[k] = LeftArray[i];    
	            i++;    
	        }    
	        else    
	        {    
	            a[k] = RightArray[j];    
	            j++;    
	        }    
	        k++;    
	    }    
	    while (i<n1)    
	    {    
	        a[k] = LeftArray[i];    
	        i++;    
	        k++;    
	    }    
	      
	    while (j<n2)    
	    {    
	        a[k] = RightArray[j];    
	        j++;    
	        k++;    
	    }    
	}    
	
	public void printArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
	}

	public static void main(String[] args) {

		   int array[]= {4,2,1,56,3,2,1};
			
			MergeSort object=new MergeSort();
			object.mergeSort(array, 0, array.length-1);
			object.printArray(array);

	}

}
