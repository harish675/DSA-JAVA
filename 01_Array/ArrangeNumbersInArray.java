import java.util.Scanner;
public class ArrangeNumbersInArray {

	public static void arrange(int[] arr, int n) {
		int odd=0;
		int even=1;
		for(int i=1;i<=n;i++)
			if(i % 2==0){
				arr[n-even]=i;
				even++;
			}

			else{
				arr[odd]=i;
				odd++;
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
		System.out.println("Entre your N");
		int n=s.nextInt();
		int arr[]=new int[n];

		arrange(arr,n);
		print(arr);
	}

}
