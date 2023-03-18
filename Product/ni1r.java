import java.util.Scanner;
class main
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of the array:");
	int n=s.nextInt();
	int count=0;
	int[] arr=new int[n];
	for(int i=0;i<n;i++)
{
	arr[i]=s.nextInt();
}
	/*for(int i=0;i<n;i++)
{
	System.out.println(arr[i]);
}	*/
int ini=arr[0];
int las=ini;
int res=0;
int end=0;
int yyy=0;
int i=0;
//System.out.println("arr[n-1]"+arr[n-1]);
while(arr[i]!=arr[n-1])
{	
	//System.out.println("HI");
for(i=end;i<=arr[i];i++)
{
	//las=arr[i];
	end=i;
	//System.out.println("I:"+i);
	//System.out.println();
	if(arr[i]==arr[n-1])
{	//System.out.println("HI");
	//yyy=arr[n-1];
	//res=count;
//break;
}
}
count++;
}
System.out.println("Output:"+count);
}
}