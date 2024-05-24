import java.util.Scanner;

public class LeftHalfPyramidPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nuber");
		int n=sc.nextInt();
		char ch=sc.next().charAt(0);
		for(int i=0; i<n; i++) {
			for(int j=1; j<2*(n-i); j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print(ch+" ");
			}
		System.out.println();
		}
	}
}
