import java.util.Scanner;
class main
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	int arr[][]={{1,2},{3,4}};
	int len=arr.length;
	int temp=0;
	int mul1=1;
	int mul2=1;
	int time=0;
	for(int i=0;i<len;i++)
{
	for(int j=0;j<len;j++)
{
	System.out.printf("%d ",arr[i][j]);
}
	System.out.println();
}
	for(int i=0;i<len;i++)
{
	for(int j=0;j<len;j++)
{
	if(time<1)
{			
	temp=arr[len-1][len-1];
	mul1=arr[i][j]*temp;
	arr[len-1][len-1]=arr[i][j];
	arr[i][j]=temp*1;
	
	//System.out.printf("%d %d",i,j);
	time++;
}
	else if(i!=j)
{	
	mul2*=arr[i][j];
	arr[i][j]=arr[i][j]*-1;
}	
}
	System.out.println();
}	
	System.out.println("muli"+mul1);
	System.out.println("muls"+mul2);
	int div=mul1-mul2;
	
	if(div<0)
{
	div=div*-1;
}
System.out.println("Div"+div);
//float res=1/div;
	for(int i=0;i<len;i++)
{
	for(int j=0;j<len;j++)
{
	System.out.printf("%d ",arr[i][j]/div);
}
	System.out.println();
}
}
}