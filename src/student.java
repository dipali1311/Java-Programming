import java.util.Scanner;
public class student {
    student(int roll)
    {
        System.out.println("Name: Unknown");
        System.out.println("Roll number: " + roll);
    }

    student(String Name, int roll)
    {
        System.out.println("Name: " + Name);
        System.out.println("Roll number: " + roll);
    }
    public static void main(String[] args)
    {
        int roll_number;
        String Name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name and roll number: ");
        Name = sc.nextLine();
        roll_number = sc.nextInt();
        student S1 = new student(Name,roll_number);
        student S2 = new student(roll_number);

    }
}

