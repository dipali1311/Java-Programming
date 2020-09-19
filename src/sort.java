import java.util.Scanner;
public class sort {
    public static void main(String[] args) {
        int n, i, j, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements:");
        for (i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for (i = 0; i < n; i++) {
            for (j = 0; j < (n - i) - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            System.out.println("Sorted array is:");
            for (i = 0; i < n; i++)
                System.out.println(+a[i]);
        }
    }
}
