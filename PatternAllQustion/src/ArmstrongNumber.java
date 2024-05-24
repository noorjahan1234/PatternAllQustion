import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int num=n;
		int rem, rev, sum=0;
		while(n!=0) {
			rem=n%10;
			rev=(rem*rem*rem);
			sum=sum+rev;
			n=n/10;
		}
		n=num;
		if(n==sum) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
