import java.util.*;
class main
{
	public static void main(String args[])
{	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of the array:");
	int n=s.nextInt();
	int arr[]=new int[n];
	int count;
	int count1=0;
	int size=n;
	int result=0;
	for(int i=0;i<n;i++)
{
	 arr[i]=s.nextInt();
}
	for(int i=0;i<n;i++)
{		
	int res=arr[i];
	count=0;
	for(int j=0;j<n;j++)
{
	if(res==arr[j])
{
	count++;
	result=arr[j];
}
	if(count>n/2)
{
	count1=count;
}
}
}
	System.out.println("No of Times:"+count1);
	System.out.println("Output Element:"+result);
}
}