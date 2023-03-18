import java.util.Scanner;
class main
{
public static void main(String[] args)
{	
	Scanner s=new Scanner(System.in);
	bank b=new bank();
	System.out.println("Enter the no of banks");
	int n=s.nextInt();
String[] arr=new String[n];
	int[] arr1=new int[n];
	for(int i=0;i<n;i++)
{
	System.out.printf("\nEnter the %d Bank Name:",i+1);	
	arr[i]=s.next();
}
	for(int i=0;i<n;i++)
{
	System.out.printf("\nEnter the %d Bank Deposit:",i+1);	
	arr1[i]=s.nextInt();
}	
	System.out.println("Enter The Bank Name:");
	String find=s.next();
	for(int i=0;i<ars2.length;i++)
{
	if(ars1[i].equals(find))
{
	int j=i;
//System.out.printf("The Amount Deposited in Bank %s is %d",ars1[i],ars2[i]);
}
}	
	b.getbalance(arr[j],arr1[j]);
	//b.getbalance(arr[1],arr1[1]);
	//b.getbalance(arr[2],arr1[2]);
}
}
class bank
{	
	
	int getbalance(String ars1,int ars2)
{
	return 0;
}
}