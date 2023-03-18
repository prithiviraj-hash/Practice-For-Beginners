import java.util.*;
class main
{
    public static void main(String[] args)
    {
        int arr[][]={{1,2,3},{4,5,6}};
        int row=0;
        int column=0;
        int n=arr.length;
        System.out.println("N:"+n);
        int gh=0;
        int cp[]=new int[6];
        for(int i=0;i<n;i++)
        {
            row++;
            column=0;
            for(int j=0;j<3;j++)
            {
                column++;
                System.out.printf("%d ",arr[i][j]);
                cp[gh]=arr[i][j];
                gh++;
            }
            System.out.println();
        }
        int cpy[][]=new int[column][row];
        gh=0;
        for(int i=0;i<column;i++)
        {
                cpy[i][0]=cp[gh];
                gh++;
        }
        for(int i=0;i<column;i++)
        {
                cpy[i][1]=cp[gh];
                gh++;
        }
        
        for(int i=0;i<column;i++)
        {
            for(int j=0;j<row;j++)
            {
                System.out.printf("%d ",cpy[i][j]);
            }
            System.out.println();
        }
        System.out.printf("\n%d ",arr[0][0]*cpy[0][0]+arr[0][1]*cpy[1][0]+arr[0][2]*cpy[2][0]);
        System.out.printf("%d ",arr[0][0]*cpy[0][1]+arr[0][1]*cpy[1][1]+arr[0][2]*cpy[2][1]);
        System.out.printf("\n%d ",arr[1][0]*cpy[0][0]+arr[1][1]*cpy[1][0]+arr[1][2]*cpy[2][0]);
        System.out.printf("%d ",arr[1][0]*cpy[0][1]+arr[1][1]*cpy[1][1]+arr[1][2]*cpy[2][1]);
    }
}