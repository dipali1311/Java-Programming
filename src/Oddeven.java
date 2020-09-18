import java.util.Scanner;

public class Oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the value a");
        n = sc.nextInt();
        if (n % 2 == 0) {
            if (n >= 2 && n <= 5) {
                System.out.println("Not weird");
            } else if (n >= 6 && n <= 20) {
                System.out.println("Weird");
            } else if (n > 20) {
                System.out.println("Not weird");
            }
        }else {
                System.out.println("Weird");
            }
        }
}

