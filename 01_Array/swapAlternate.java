import java.util.Scanner;

public class SwapAlternate {
	
	public static void swapAlternate(int arr[]) {
    	//Your code goes here

        if(arr.length%2==0){
           
            for(int i=0;i<arr.length;i=i+2){

              int temp=arr[i];
              arr[i]=arr[i+1];
              arr[i+1]=temp;
              }
        }

        else{

             for(int i=0;i<arr.length-1;i=i+2){

              int temp=arr[i];
              arr[i]=arr[i+1];
              arr[i+1]=temp;
         }
         
        }
         
    }
	
	
	public static void print(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Entre The Size of Input");
		int n=s.nextInt();
	
		int arr[]= new int[n];
		
		System.out.println("entre The Input Element");
		
		for(int i=0;i<n;i++) {
			 
			arr[i]=s.nextInt();
		}
		System.out.println("Before :");
		print(arr);
		swapAlternate(arr);
		System.out.println();
		System.out.println("after :");
		print(arr);
			
		
	}

}
