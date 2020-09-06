import java.util.*;
public class TestProgram 
{
    private static Scanner userIn = new Scanner(System.in);

    private static boolean checkInvalidAge(int age)
    {
        if (age <= 0 || age > 120) { return true; }
        return false;
    }
    public static void main(String args[])
    {
        int userAge = 0;
        while (checkInvalidAge(userAge))
        {
            System.out.print("Enter your age: ");  
            try
            {
                userAge = userIn.nextInt();
                if (checkInvalidAge(userAge)) { throw new Exception(); }
            } catch (Exception e)
            {
                //e.printStackTrace();
                if (e instanceof InputMismatchException) { userIn.next(); } //if string, ignore
                System.out.println("\nPlease enter a valid age");
            }
        }
        System.out.printf("You are %d years old!", userAge);
    }
}
