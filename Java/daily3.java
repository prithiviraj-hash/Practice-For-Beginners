import java.util.Scanner;
class main
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter no of employees:");
	int n=s.nextInt();
	String[] arr1=new String[n];
	int[] arr2=new int[n];
	String[] arr3=new String[n];
	for(int i=0;i<n;i++)
{
	System.out.println("Enter Employee Name:");
	arr1[i]=s.next();
	System.out.println("Enter The Year of Joining:");
	arr2[i]=s.nextInt();
	System.out.println("Enter The Location:");
	arr3[i]=s.next();
}
System.out.printf("Employee Names");
for(int i=0;i<8;i++)
{
System.out.printf(" ");
}
System.out.printf("Year of Joining");
for(int i=0;i<8;i++)
{
System.out.printf(" ");
}
System.out.printf("Address");
System.out.println();
//int len1="Robert";
//int len2="Sam";
//int len3="John";
int[] len=new int[3];
len[0]=6;
len[1]=3;
len[2]=4;
for(int i=0;i<n;i++)
{
	System.out.printf("%s",arr1[i]);
	for(int j=0;j<25-len[i];j++)
{
	System.out.printf(" ");
}
	System.out.printf("%d",arr2[i]);
	for(int j=0;j<10;j++)
{
	System.out.printf(" ");
}
	System.out.printf("%s",arr3[i]);
	System.out.println();
}
}
}