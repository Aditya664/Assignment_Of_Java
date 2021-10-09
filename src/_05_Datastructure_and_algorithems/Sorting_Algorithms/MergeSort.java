package Sorting_Algorithms;

public class MergeSort  
{  
	public static void main(String args[])  
	{  
		int[] list= {6,2,8,4,10,3,7,0,9};
		sort(list,0,list.length-1);
		for( int i : list)
		{
			System.out.print(i+"   ");
		}
	} 
	
	private static void sort(int arr[], int beg, int end)  
	{  
		if (beg<end)  
		{  
			int mid = (beg+end)/2;  
			sort(arr, beg, mid);  
			sort(arr , mid+1, end);  
			merge(arr, beg, mid, end);  
		}  
	}  
	
	private static void merge(int arr[], int beg, int mid, int end)  
	{  
	  
		int l = mid - beg + 1;  	
		int r = end - mid;  			
												
		int LeftArray[] = new int [l]; 			
		int RightArray[] = new int [r];			 
		  
		for (int i=0; i<l; i++)  											
			LeftArray[i] = arr[beg + i];  
		  
		for (int j=0; j<r; j++)  
			RightArray[j] = arr[mid + 1+ j];  
		  
		  
		int i = 0, j = 0;  
		int k = beg;  
		
		while (i<l&&j<r)  
		{  
			if (LeftArray[i] <= RightArray[j])  
			{  
				arr[k] = LeftArray[i];  
				i++;  
			}  
			else  
			{  
				arr[k] = RightArray[j];  
				j++;  
			}  
			
			k++;  
		}  
		
		while (i<l)  
		{  
			arr[k] = LeftArray[i];  
			i++;  
			k++;  
		}  
		  
		while (j<r)  
		{  
			arr[k] = RightArray[j];  
			j++;  
			k++;  
		}  
	}  
}