//Reversal Algorithm
public class RotateArray {
	static void leftRotate(int arr[],int d , int n){
	    //check whether d is greater than n 
	    if(d==0)
	        return;
	    else
	        d =d%n;
	    //calling reverseArray method
	    reverseArray(arr,0,d-1);
	    reverseArray(arr,d,n-1);
	    reverseArray(arr,0,n-1);
	}
	static void reverseArray(int arr[] ,int start , int end){
	    int temp;
	    //reverse the element one by one
	    while(start<end){
	        temp = arr[start];
	        arr[start] = arr[end];
	        arr[end]=temp;
	        start++;
	        end--;
	    }
	}
	void printArray(int arr[]) {
		for (int i : arr)
			System.out.print(i + " ");
	}
	public static void main(String[] args) {
		RotateArray rotate = new RotateArray();
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		int n = arr.length;
		rotate.leftRotate(arr,2,n);
		rotate.printArray(arr);
	}
}
