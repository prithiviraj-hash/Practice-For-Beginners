import java.util.*;
class main
{
	public static void main(String[] args)
{	
	Scanner s=new Scanner(System.in);
	//int n=s.nextInt();
	String sr="dabAcCaCBAcCcaDA";
	int size=16;
	char ch[]=new char[size];
	for(int i=0;i<size;i++)
{
	ch[i]=sr.charAt(i);
}
/*	for(int i=0;i<size;i++)
{
	System.out.println(ch[i]);
}*/
	for(int i=0;i<size-1;i++)
{
	if((ch[i]=='a' && ch[i+1]=='A') ||(ch[i]=='A' && ch[i+1]=='a') || (ch[i]=='b' && ch[i+1]=='B') ||(ch[i]=='B' && ch[i+1]=='b') || ch[i]=='c' && ch[i+1]=='C' ||(ch[i]=='C' && ch[i+1]=='c'))
{
	for(int j=i;j<size-2;j++)
{
	ch[j]=ch[j+2];
	System.out.printf("%c ",ch[i]);
}
}
}

	System.out.println();
	for(int i=0;i<ch.length;i++)
{
	System.out.printf("%c ",ch[i]);
}
}
}