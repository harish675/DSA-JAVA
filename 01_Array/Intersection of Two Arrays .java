import java.util.Scanner;

public class IntersectionofTwoArrays {
	
	public static void intersections(int arr1[], int arr2[]) {
   

        for(int i=0;i<arr1.length;i++){

             for(int j=0;j<arr2.length;j++){
                       
                         if(arr1[i]==arr2[j]){
                              System.out.print(arr1[i]+" ");
                              arr2[j]=-99;
                              break;
                         }
             }
        }
    }
	
	public static int[] input(int size) {
		 Scanner s= new Scanner(System.in);
		 System.out.println("entre array element:");
		  int arr[] =  new  int[size];
		  for(int i=0;i<size;i++) {
			   
			  arr[i]=s.nextInt();
			   
		  }
		  
		  return arr;
	}

	public static void main(String[] args) {
		 
		Scanner s= new Scanner(System.in);
	
		System.out.println("Entre your first array size:");
		int size1 = s.nextInt();
		int arr1[] = input(size1);
		
		System.out.println("Entre your second array size:");
		int size2 = s.nextInt();
		int arr2 []= input(size2);
		
		System.out.println("output are the :");
		intersections(arr1,arr2);
	}

}
