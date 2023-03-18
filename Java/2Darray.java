import java.util.Scanner;
public class main{
    public static void main(String[] args)
    {   
        Scanner s=new Scanner(System.in);
        System.out.printf("Enter the Row Size of the 2D array:");
        int r=s.nextInt();
        System.out.printf("Enter the Row Size of the 2D array:");
        int c=s.nextInt();
        int arr[][]=new int [r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
               System.out.printf("\nEnter the element in [%d] [%d]:",i,j);
               int u=s.nextInt();
               arr[i][j]=u;
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
               System.out.printf("\nThe element in [%d] [%d]:",arr[i][j]); 
            }
        }
    }
}