import java.util.Scanner;
class assesment5{
public static void main(String[] args)

{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int n2=1;
int n1=1;
int n3;
n3=n1+n2;
//System.out.println(+n1);
//System.out.println(+n2);
for(int i=1;i<a-1;i++)
{	
//System.out.print(n3);
	n3=n1+n2;
	n1=n2;
	n2=n3;
}
System.out.print(n3);
}
}