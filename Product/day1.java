/*import java.util.*;
class main
{
	public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the no of Elements:");
	int n=s.nextInt();
	int arr[]=new int[n];
for(int i=0;i<n;i++)
{
	arr[i]=s.nextInt();
}
	int rep=arr[0];
	int flag=0;
	int count=0;
	for(int i=0;i<n;i++)
{
	if(rep==arr[i+1])
{
	flag=1;
}
	if(arr[i]!=arr[i+1])
{
	count++;
}
if(i==n-1)
{
if(arr[0]!=arr[n-1])
{
count++;}
}
}System.out.println("Count:"+count);
}
}*/
import java.util.*;

class alice
{
public static void main(String args[])
{
int n,i,count=0;

Scanner sc=new Scanner(System.in);
System.out.println("Array size");

n=sc.nextInt();

int a[]=new int[n];


System.out.println("Array elements ");


for(i=0;i<n;i++)
{
  
a[i]=sc.nextInt();  

}
System.out.println("Given Array");

for(i=0;i<n;i++)
{
   

System.out.print(a[i]+" ");

}

for(i=0;i<n-1;i++)
{
if(a[i]==a[i+1])
{

}
else
{

count++;
}


}



if(a[0]==a[n-1])
{

}
else
{

count++;
}




System.out.print("\nThe mistakes are "+count);









}
}