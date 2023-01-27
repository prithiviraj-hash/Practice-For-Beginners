import java.util.Scanner;
class main{
    public static void main(String[] args)
    {   
        Scanner s=new Scanner(System.in);
	  System.out.println("Enter a number:");
        int n=s.nextInt();
        int i=1;
        while(i<=n)
        {   
            for(int y=0;y<i;y++)
            {
                System.out.printf("* ");
            }
            System.out.println();
            i++;
        }
    }
}