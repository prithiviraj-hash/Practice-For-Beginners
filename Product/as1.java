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
	int[] arr=new int[n];
	for(int i=0;i<n;i++)
{
	arr[i]=s.nextInt();
}
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
}
/*for(int j=0;j<n;j++)
{
	System.out.printf("%d ",arr[j]);
}
	System.out.println();
}*/
	if(count!=0)
{
	System.out.printf("The Array is Rotated %d times",count-3);
}
	else
{
	System.out.printf("The Array is Rotated %d times",count);
}
}
}