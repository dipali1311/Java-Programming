import java.util.Scanner;
public class method_overloading
{
    public int Sum(int a,int b)
    {
        int sum;
        sum=a+b;
        return sum*sum;
    }
    public int Sum(int a,int b,int c)
    {
        int sum;
        sum=a+b+c;
        return sum*sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        method_overloading O1 = new method_overloading();
        method_overloading O2 = new method_overloading();
        int n,a,b,c,sq;
        System.out.println("Enter the number of inputs: ");
        n=sc.nextInt();
        if(n==2)
        {
            System.out.println("Enter the two numbers: ");
            a=sc.nextInt();
            b=sc.nextInt();
            sq=O1.Sum(a,b);
            System.out.println("The square of sum of the numbers is: "+sq);
        }
        else
        {
            System.out.println("Enter the three numbers: ");
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            sq=O2.Sum(a,b,c);
            System.out.println("The square of sum of the numbers is: "+sq);
        }
    }
}
