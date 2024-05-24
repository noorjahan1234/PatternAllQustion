import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
//		StringBuilder sb=new StringBuilder(str);
//		System.out.println(sb.reverse());
		String strr="";
		for(int i=str.length()-1; i>=0; i--) {
			
		strr=strr+str.charAt(i);
		}
			System.out.println(strr);
		
	}

}
