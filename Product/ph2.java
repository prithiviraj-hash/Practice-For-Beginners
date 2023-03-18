import java.util.*;
class main
{
	public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
	int cpy[][]=new int[3][3];
	int res[][]=new int[3][3];
	int n=arr.length;
	int flag;
	for(int i=0;i<n;i++)
{
	for(int j=0;j<n;j++)
{
	cpy[i][j]=arr[j][i];
}
	System.out.println();
}	
System.out.println("Transporsed:");
	for(int i=0;i<n;i++)
{
	for(int j=0;j<n;j++)
{
	System.out.printf("%d ",cpy[i][j]);
}
	System.out.println();
}	
	System.out.println("0.For ClockWise");
	System.out.println("1.For Anti-ClockWise");
	flag=s.nextInt();
if(flag==0)
{	
	for(int i=0;i<3;i++)
{
	for(int j=2;j>=0;j--)
{	
	System.out.printf("%d ",cpy[i][j]);
}
	System.out.println();
}
}
else if(flag==1)
{
    for(int i=2;i>=0;i--)
{
	for(int j=0;j<n;j++)
{	
	System.out.printf("%d ",cpy[i][j]);
}
	System.out.println();
}
}
}
}