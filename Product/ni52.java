import java.util.Scanner;

public class mar10nigth2
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        String goal=scan.nextLine();
        if(s.length()==goal.length())
        {
            if((s+s).contains(goal))
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
        }
    }
}
