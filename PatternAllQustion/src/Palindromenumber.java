import java.util.Scanner;

public class Palindromenumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int originalNum = n; // Store the original value of n
        int rev, sum = 0;
        while (n > 0) {
            rev = n % 10;
            sum = (sum * 10) + rev;
            n = n / 10;
        }
        if (originalNum == sum) { // Compare with the original value
            System.out.println("Palindrome Number: " + sum);
        } else {
            System.out.println("Not Palindrome Number: " + sum);
        }
    }
}
