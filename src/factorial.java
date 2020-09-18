import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p=1,n,i;
        System.out.println("Enter the number");
        n = sc.nextInt();
        for(i=1;i<=n;i++)
            p=p*i;
        System.out.println("Factorial=" +p);
    }
}
