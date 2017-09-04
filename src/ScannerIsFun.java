import java.util.Scanner;
public class ScannerIsFun {

    public static void main(String[] args) {
        String prompt = "Enter your username";
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        String username =sc.next();
        System.out.println("Enter your password");
        String passpord=sc.next();
        System.out.println("Hello "+username+" ,Welcome to CSC200 class! and Your password is "+passpord);
    }
}