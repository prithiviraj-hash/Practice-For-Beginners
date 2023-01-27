import java.util.Scanner;
class main{
    public static void main(String[] args)
    {   
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Breath and Length:");
        int breath=s.nextInt();
        int length=s.nextInt();
        int n=breath;
        for(int i=0;i<breath;i++)
        {
            for(int j=0;j<length+2;j++)
            {
                if(i==0 || i==n-1 || j==0 || j==n-1)
                {
                    System.out.printf("*");
                }
                else
                {
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }
    }
}