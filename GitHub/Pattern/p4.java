import java.util.Scanner;
class main{
    public static void main(String[] args)
    {   
        Scanner s=new Scanner(System.in);
	  System.out.println("Enter a number:");
        int n=s.nextInt();
        int i=1;
        while(i<=n-1)
        {   
            for(int y=0;y<i;y++)
            {   
                if(y==0 || y==i-1)
                {
                System.out.printf("* ");
                }
                else
                System.out.printf("  ");
            }
            System.out.println();
            i++;
        }
		for(int yyy=0;yyy<n;yyy++)
			{
			System.out.printf("* ");	}
    }
}