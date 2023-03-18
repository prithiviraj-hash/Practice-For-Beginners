import java.util.Scanner;
class assesment3{
public static void main(String[] args)
{	
Scanner s=new Scanner(System.in);
System.out.println("Enter N value:");
int n=s.nextInt();
int res=0;
int result=1;
int i=0;
if(n>999 && n<10000)
{
while(i<4)
{
	res=n%10;
	result*=res;
	n=n/10;
	
//System.out.println(res);

i++; 
}System.out.println(result);	 
}
else if(n>=10000 && n<100000)
{
while(i<4)
{
	res=n%10;
	result*=res;
	n=n/10;
	
//System.out.println(res);

i++; 
}System.out.println(result);	 
}
}}