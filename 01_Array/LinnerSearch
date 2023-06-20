import java.util.Scanner;
public class LinnerSearch {

	public static int linnerSearch(int [] arr,int k) {
		
		 for(int i=0;i<arr.length;i++) {
			 
			 if(arr[i]==k) {
				 return i;
			 }
		 }
		
		return -1;
	}
	public static void main(String[] args) {
		
       Scanner s= new Scanner (System.in);
       
       System.out.println("entre your input size");
       
       int n=s.nextInt();
       
       System.out.println("entre your array element");
       
       int arr[]=new int[n];
       
       for(int i=0;i<n;i++) {
    	   arr[i]=s.nextInt();
       }
       
       System.out.println("entere the element to the search");
       int k=s.nextInt();
       
       int index=linnerSearch(arr,k);
       System.out.println("the index are :"+index);
	}

}
