import java.util.*;
class main
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Row and Column Size:");
        int n1=s.nextInt();
        int n2=s.nextInt();
        //int arr[][]=new int[n1][n2];
        int arr[][]={{3,0,3,7,3},{2,5,5,1,2},{6,5,3,3,2},{3,3,5,4,9},{3,5,3,9,0}};
        int edge=n2+n1-1+n2-1+n1-2;
        int ars[]=new int[n1];
        int max;
        int count=0;
        for(int i=0;i<n1;i++)
        {
            max=arr[i][0];
            for(int j=0;j<n2;j++)
            {
                if(max<arr[i][j])
                {
                    max=arr[i][j];
                    count++;
                }
            }
            ars[i]=max;
        }
        System.out.printf("\nWith %d trees visible on the edge and another %d visible in the interior, a total of %d trees are visible in this arrangement",edge,count-1,edge+count-1);
    }
}