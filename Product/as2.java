import java.util.*;
class main
{
public static void main(String[] args)
{	
	ArrayList<Integer> demo=new ArrayList<Integer>();
	Scanner s=new Scanner(System.in);
	int in;
	System.out.println("Enter The Size of Input:");
	int n=s.nextInt();
	System.out.println("Enter The Days:");
	int days=s.nextInt(); 
	for(int i=0;i<n;i++)
{
	in=s.nextInt();
	demo.add(in);
}
	for(int i=0;i<demo.size();i++)
{
	System.out.println("Elements:"+demo.get(i));
}	
	int ret=1;
	while(ret<=days)
{
	int temp=0;
	for(int i=0;i<demo.size();i++)
{
	temp=demo.get(i);
	temp=temp-1;
	demo.set(i,temp);
}
	System.out.printf("After Day %d:",ret);
	for(int j=0;j<demo.size();j++)
{
	System.out.printf("%d ",demo.get(j));
}
	System.out.println();
	for(int i=0;i<demo.size();i++)
{
if(demo.get(i)==0)
{
	demo.add(9);
	demo.set(i,7);
}
}
ret++;
}
}
}