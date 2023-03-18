import java.util.*;
class main
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Row and Column Size:");
	int n1=s.nextInt();
	int n2=s.nextInt();
	int total=n1*n2-4;
	int count=0; 
	int arr[][]={{3,0,3,7,3},{2,5,5,1,2},{6,5,3,3,2},{3,3,5,4,9},{3,5,3,9,0}};
	int max;
	for(int i=0;i<n1;i++)
{
	max=arr[i][0];
	for(int j=1;j<n2;j++)
{
	if(arr[i][j]>max)
{
	count++;
	max=arr[i][j];
}
}
}
System.out.printf("\nWith %d trees visible on the edge and another %d visible in the interior, a total of %d trees are visible in this arrangement",total,count,total+count);
}
}