import java.util.Scanner;

public class Primenumberprogram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(n%2!=0)
			{
			System.out.println("Prime Number");
			}
		else {
			System.out.println("Not");
		}
	}
}
