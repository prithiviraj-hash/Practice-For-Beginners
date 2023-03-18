import java.util.*;
class main
{
	public static void main(String[] args)
{	
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int arr[]={0,1,3,5,6,8,12,17};
	int k=0;
	int prev=0;
	int count=0;
	for(int i=0;i<n-1;i++)
{	
	//for(int j=i+1;j<n-1;j++)
	k=prev;
	System.out.println("K:"+k);

	if(k+1+arr[i]==arr[i+1])// || k+arr[i]==arr[i+1] || k-1+arr[i]==arr[i+1])
{	
	for(int r=i+2;r<n-1;r++)
{
	if(k+1+arr[i]==arr[r])
{
	prev=k;
	System.out.println("prev1:"+prev);
	System.out.println("element1:"+arr[i+1]);
	count++;
}
else
{
	prev=k+1;
	System.out.println("prev1:"+prev);
	System.out.println("element1:"+arr[i+1]);
	count++;
}
}
}
	else if(k+arr[i]==arr[i+1])
{
	prev=k;
	System.out.println("prev2:"+prev);
	System.out.println("element2:"+arr[i+1]);
	count++;
}
	else if(k-1+arr[i]==arr[i+1])
{
	prev=k-1;
	System.out.println("prev3:"+prev);
	System.out.println("element3:"+arr[i+1]);
	count++;
}
}
	System.out.println("Count:"+count);
	if(count==7)
{
	System.out.println("True");
}
	else
{
	System.out.println("False");
}
}
}