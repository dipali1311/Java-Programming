import java.util.Scanner;
public class fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, num1 = 0, num2 = 1;
        System.out.print("Enter the number of terms");
        n = sc.nextInt();
        int i=1;
        while(i<=n)
        {
            System.out.print(num1+" ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            i++;
        }
    }
}

