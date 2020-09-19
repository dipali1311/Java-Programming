import java.util.Scanner;
public class Sum_array
{
    public static void main(String[] args)
    {
        int n,i,sum = 0;
        float avg;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array:");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements:");
        for(i = 0; i < n ; i++)
        {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum="+sum);
        avg = (float)sum / n;
        System.out.println("Average="+avg);
    }
}
