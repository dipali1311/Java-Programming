import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b,c=0;
        System.out.println("Enter the value a and b");
        a = sc.nextFloat();
        b = sc.nextFloat();
        System.out.println("Enter the operator (+,-,*,/)");
        char operator = sc.next().charAt(0);
        switch(operator) {
            case '+':
                c=a+b;
                System.out.println("Sum of the numbers is: "+ c +" ");
                break;
            case '-':
                c=a-b;
                System.out.println("Difference of the numbers is: "+ c +" ");
                break;
            case '*':
                c=a*b;
                System.out.println("Product of the numbers is: "+ c +" ");
                break;
            case '/':
                if(b==0)
                    System.out.println("Division not possible");
                else
                    c=a/b;
                System.out.println("Quotient of the numbers is: " + c + " ");
                break;
            default:  System.out.println("Invalid Input");
        }
    }
}

