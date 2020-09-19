import java.util.Scanner;
public class Sum_2D {
    public static void main(String[] args) {
        int i, j, m, n, p, q;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order of Matrix 1:");
        m = sc.nextInt();
        n = sc.nextInt();
        System.out.println("Enter the order of Matrix 2:");
        p = sc.nextInt();
        q = sc.nextInt();
        int a[][] = new int[m][n];
        int b[][] = new int[p][q];
        int c[][] = new int[m][q];
        System.out.println("Enter the elements of Matrix 1:");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        }
        System.out.println("Enter the elements of Matrix 2:");
        for (i = 0; i < p; i++) {
            for (j = 0; j < q; j++)
                b[i][j] = sc.nextInt();
        }
        if (m == p && n == q) {
            for (i = 0; i < p; i++) {
                for (j = 0; j < q; j++)
                     c[i][j]=a[i][j] + b[i][j];
            }
            System.out.println("Sum of matrix is:");
            for (i = 0; i < p; i++) {
                for (j = 0; j < q; j++)
                    System.out.print(c[i][j]+" ");
                 System.out.println();
            }
        }
        else
            System.out.println("Matrices can't be added");
    }
}





