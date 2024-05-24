import java.util.Scanner;

public class Biggestelement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int j=arr[0];
		for(int i=1; i<arr.length; i++) {
//			if(arr[i]<j) 
			if(arr[i]>j){
				j=arr[i];
			}
		}
			System.out.println("Biggest Number: "+j);
	}

}
