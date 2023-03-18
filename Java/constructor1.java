import java.util.*;
class name
{
    name(String s)
    {
        String gt=s;
       for(int i=1;i<=15;i++)
        {
            System.out.println(gt);
        }
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The String to print 15 Times:");
        String g=s.nextLine();
        name n=new name(g);
    }
}