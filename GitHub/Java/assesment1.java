import java.util.Scanner;
class assesment1{
public static void main(String[] args)
{	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Number:");
	int num=s.nextInt();
	int fc=5;
	int tc=2;
	int oc=1;
int a=0;
int b=0;
int c=0;
int res=0;
int count=0;
int count1=0;
for(int i=1;i<=num;i++)
{	
for(int j=1;j<=num;j++)
{	
for(int y=1;y<=num;y++)
{
	res=fc*i+tc*j+oc*y;
	count=i+j+y;
	if(res==num)
{	
count1=count;
a=i;
b=j;
c=y;
//System.out.printf("\n%d %d %d %d",count,i,j,y);
}
}
}
}
System.out.printf("\n%d %d %d %d",count1,a,b,c);
}
}