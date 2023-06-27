import java.util.Scanner;

public class findDuplicate {
	
	
	public static int duplicateNumber(int arr[]) {
    	//Your code goes here

        int ans=0;
        for(int i=0;i<arr.length-1;i++){
             for(int j=i+1;j<arr.length;j++){
                  if(arr[i]==arr[j]){
                        
                        ans=arr[i];
                        break;
                  }
             }
        }

        return ans;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner s= new Scanner (System.in);
	       
	       System.out.println("entre your input size");
	       
	       int n=s.nextInt();
	       
	       System.out.println("entre your array element");
	       
	       int arr[]=new int[n];
	       
	       for(int i=0;i<n;i++) {
	    	   arr[i]=s.nextInt();
	       }
	       
	    int ans  = duplicateNumber(arr);
	       
	       System.out.println("The Duplicate are the :"+ans);

	}

}
