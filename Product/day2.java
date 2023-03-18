import java.util.Scanner;
class main
{
	public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Row and Column Size:");
	int n1=s.nextInt();
	int n2=s.nextInt();
	int arr[][]=new int[n1][n2];
	for(int i=0;i<n1;i++)
{
	for(int j=0;j<n2;j++)
{
	arr[i][j]=s.nextInt();
}
}
int rep;
int count;
int g=0;
//int dum;
int ind[]=new int[n1];
int reps[]=new int[n1];
	for(int i=0;i<n1;i++)
{	
	count=0;
	//rep=arr[i][0];
	for(int j=0;j<n2;j++)
{
	if(arr[i][j]==1)
{
	count++;
	g=i+1;
}
reps[i]=count;
	ind[i]=g;	
}
	
}
	int max1=reps[0];
	int dum=0;
/*	for(int i=0;i<n1;i++)
{
	System.out.printf("reps%d ",reps[i]);
}
	for(int i=0;i<n1;i++)
{
	System.out.printf("ind%d ",ind[i]);
}*/
	for(int i=0;i<n1;i++)
{
	if(max1<reps[i])
{
	max1=reps[i];
	dum=i;
}
} //aefawfaw;
/*int max1=ind[0];
	for(int i=0;i<n1;i++)
{
	if(max1<ind[i])
{
	max1=ind[i];
}
}*/
System.out.printf("Row %d has maximum number of 1's",ind[dum]);
}
}