import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        int i, j;
        for (i = 5; i >= 1; i--) {
            for (j = i; j >0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

