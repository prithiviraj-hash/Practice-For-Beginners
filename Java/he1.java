import java.util.Scanner;
class main
{
public static void main(String[] args)
{	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of test cases:");
	int n=s.nextInt();
	while(n>0)
{	
	int count1=0;
	int count2=0;
	System.out.println("Enter the cost of each ballon:");
	int a=s.nextInt();
	int b=s.nextInt();
	int temp;
	if(b>a)
{
	temp=a;
	a=b;
	b=temp;
}
	System.out.println("Enter the number of ballons:");
	int num=s.nextInt();
	int[] arr1=new int[num];
	int[] arr2=new int[num];
	for(int i=0;i<num;i++)
{
	arr1[i]=s.nextInt();
	arr2[i]=s.nextInt();
}
	for(int i=0;i<num;i++)
{
	if(arr1[i]==1)
{
	count1++;
}
}
	for(int i=0;i<num;i++)
{
	if(arr2[i]==1)
{
	count2++;
}
}
int sum=count1*a+count2*b;
System.out.println("Output:"+sum);
n--;
}
}
}