import java.util.Scanner;
class main{
    public static void main(String[] args)
    {   
        Scanner s=new Scanner(System.in);
	  System.out.println("Enter a number:");
        int n=s.nextInt();
        int i=1;
        int k=n-1;
        while(i<=n)
        {   
            for(int u=k;u>0;u--)
            {
                System.out.printf(" ");
            }
            for(int j=0;j<i;j++)
            {
                System.out.printf("* ");
            }
            System.out.println();
            i++;
            k--;
        }
    }
}