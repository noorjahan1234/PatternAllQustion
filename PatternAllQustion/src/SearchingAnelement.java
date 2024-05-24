import java.util.Scanner;

public class SearchingAnelement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for(int a : arr) {
			System.out.print(a+" ");
		}
		System.out.println("Enter the key");
		int key=sc.nextInt();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==key) {
				System.out.println("key found: "+key);
				return;
			}
		}
		System.out.println("Not Fount: "+key);
	}

}
