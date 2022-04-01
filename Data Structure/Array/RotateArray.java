public class RotateArray {
	//leftRotate method helps to call leftRotatebyOne two times
	public void leftRotate(int[] arr , int d , int n){
	    for(int i=0;i<d;i++ )
	        leftRotateByOne(arr , n);
	}
	//leftRotateByOne moves arr elements by one play i.e arr[1] to arr[0] , arr[2] to arr[1] and so on ..
	public void leftRotateByOne(int arr[] , int n){
	    // we have i for array indexing and temp to store 1st element of array i.e arr[0]
	    int i , temp ;
	    temp = arr[0];
	    //for n-1 that is till index 6 move element one by one 
	    for(i=0;i<n-1;i++)
	        arr[i]=arr[i+1];
	    //store the arr[0] element at place arr[6] i.e last index of array
	    arr[n-1]=temp;
	}
	//printArray helps to print the array 
	void printArray(int[] arr, int n){
	    for(int i : arr )
	        System.out.print(i+" ");
	}
	public static void main(String[] args) {
		//create the object rotate from class RotateArray
		RotateArray rotate = new RotateArray();
		int[] arr ={1,2,3,4,5,6,7};
		rotate.leftRotate(arr,3,7);
		rotate.printArray(arr,7);
	}
}
