import java.util.Scanner;
class main{
    public static void main(String[] args)
    {   
        Scanner s=new Scanner(System.in);
		System.out.println("Enter number:");
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.printf("* ");
            }
			System.out.println();
        }
        
    }
}