import java.util.Scanner;

public class PalindromeStringProgra {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String name");
		String name=sc.nextLine();
		String revname="";
		for(int i=name.length()-1; i>=0; i--) {
			revname=revname+name.charAt(i);
		}
		if(name.equals(revname)) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("Not");
		}
	}

}
