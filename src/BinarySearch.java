
class BinarySearch {

	public static void main(String[] args) 
	{
	  int arr[] = {2,5,7,9,10,18,35};
	  int n= arr.length;
	  int x=2;
	  
	  int result = binarySearch(arr,x,0,n-1);
	  
	  if (result==-1)
	  {
		  System.out.println("Element not found!");
	  }
	  else
	  {
		  System.out.println("Element is found at index:"+ result);
	  }
	}
	
	
	
	public static int binarySearch(int arr[], int x, int low, int high)
	{
		while(low<=high)
		{
			int mid= low +(high-low)/2;
			
			if(arr[mid]==x)
				return x;
			
			if (arr[mid]<x)
				low=mid+1;
			
			else 
				high=mid-1;
		}
		
		return -1;
					
		}
	}


