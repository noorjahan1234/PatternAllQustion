import java.util.Scanner;

public class DimangAll {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n-i-1; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	
			for(int i=0; i<n-1; i++)
			{
				for(int j=0; j<=i; j++) {
					System.out.print(" ");
				}
				for(int j=0; j<n-1-i; j++) {
					System.out.print(ch+" ");
				}
				System.out.println();
			}
	}
}
