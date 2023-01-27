import java.util.Scanner;
class assesment{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a number:");
int num=s.nextInt();
for(int i=1;i<=num;i++)
{	
if(num%i==0)
{
System.out.printf("%d  ",i);
}
}
}
}