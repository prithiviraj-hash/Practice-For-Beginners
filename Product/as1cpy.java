//import java.util.Scanner;
import java.util.*;
class main
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of the input:");
	int n=s.nextInt();
	int temp;
	int count=0;
	int count2=0;
	int[] arr=new int[n];
	int[] arr2=new int[n];
	for(int i=0;i<n;i++)
{
	arr[i]=s.nextInt();
	arr2[i]=arr[i];
}

for(int q=0;q<n;q++)
{	
for(int h=q+1;h<n;h++)
{
	if(arr2[q]>arr2[h])
{
	temp=arr2[q];
	arr2[q]=arr2[h];
	arr2[h]=temp;
	//count++;
}
}
}
/*for(int j=0;j<n;j++)
{
	System.out.printf("Sorted:%d ",arr2[j]);
}
*/	//System.out.println();
while(arr.equals(arr2)!=true)
{
for(int i=0;i<n;i++)
{	
for(int j=i+1;j<n;j++)
{
	if(arr[i]>arr[j])
{
	temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
	count++;
}	
}
	/*if(arr.equals(arr2))
{
	count2++;
}*/
}
}
/*for(int j=0;j<n;j++)
{
	System.out.printf("%d ",arr[j]);
}
	System.out.println();
}*/
	//if(count!=0)
{
	//System.out.printf("The Array is Rotated %d times",count-3);
}
	//else
{
	System.out.printf("The Array is Rotated %d times",count);
	System.out.printf("The Array is Rotated %d times",count2);
}
}
}