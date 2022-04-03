//Rotate Array using Juggling Algorithm 
class RotateArray{
    void leftRotate(int arr[],int d , int n){
        //to check whether d is greater then n
        d = d%n;
        int i , j, k , temp;
        int g_c_d = gcd(d,n);
        for(i=0;i<g_c_d;i++){
            //store the first element for each pass
            temp=arr[i];
            j=i;
            while(true){
                k = j+d;
                if(k>=n)
                    k =k-n;
                if(k==i)
                //this indicates 1 pass is over
                    break;
                arr[j]=arr[k];
                j = k;
            }
            //store the teml value in its desired place
            arr[j]=temp;            
        }
    }
    //Finding the greatest common divisor
    int gcd(int a , int b){
	    if (b ==0)
	        return a ;
	   else
	       return gcd(b,a%b);
    }
	 //Utility Function
    void printArray(int arr[], int n){
			for (int i = 0; i < n; i++){
				System.out.print(arr[i] + " ");
			}
    }
		              
    public static void main(String[] args){
        RotateArray rotate = new RotateArray();
        int arr[] ={1,2,3,4,5,6,7,8,9,10,11,12};
        rotate.leftRotate(arr,3,12);
        rotate.printArray(arr,12);        
    }       
}
