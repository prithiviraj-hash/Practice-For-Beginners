import java.util.*;
class main
{
public static void main(String[] args)
{	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter String 1:");
	String a=s.next();
	System.out.println("Enter String 2:");
	String b=s.next();
	char[] ab=new char[a.length()];
	char[] ba=new char[a.length()];
	int len=a.length();
	int count=0;
	for(int i=0;i<len;i++)
{
	ab[i]=a.charAt(i);
}
	for(int j=0;j<len;j++)
{
	ba[j]=b.charAt(j);
}
	for(int i=0;i<a.length();i++)
{
	for(int j=0;j<b.length();j++)
{
	if(ab[i]==ba[j])
{
count++;
break;
}
}
}
if(count==len)
{
System.out.println("True");
}
else
{
System.out.println("False");
}
	/*for(int i=0;i<a.length();i++)
{
	ab[i]=a.charAt(i);
}

	for(int i=0;i<b.length();i++)
{
	ba[i]=b.charAt(i);
}
if(a.contains(b))
{
	System.out.println("True");
}*/
}
}