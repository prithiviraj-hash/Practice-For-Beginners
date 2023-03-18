import java.util.Scanner;
class main{
    public static void main(String[] args)
    {   
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        for(int i=0;i<a;i++)
        {
            System.out.printf("*");
        }
        System.out.println();
        for(int u=0;u<b;u++)
        {
            for(int y=0;y<a;y++)
            {
            if(y==0 || y==a-1)
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
        for(int j=0;j<a;j++)
        {
            System.out.printf("*");
        }
        
    }
}