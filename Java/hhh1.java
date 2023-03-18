import java.util.*;
class main
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);	
	System.out.printf("Enter Customer name:");
	String name=s.nextLine();
	
	//int num=s.nextInt();
	estimate es=new estimate();
	es.res(name);
}
}
class estimate
{
	void res(String cus_name)
{
	int prev_read,curr_read;
	Scanner s=new Scanner(System.in);
	System.out.println("press 1 for domestic 2 for commercial:");
	int n=s.nextInt();
	System.out.println("Enter id:");
	int id=s.nextInt();
	String cus1="prithiviraj";
	int id1=111;
	String cus2="sudharsan";
	int id2=222;
	switch(n)
	{
	
case 1:
{
	if(cus1.equals(cus_name) && id1==id)
{
	curr_read=123;
	System.out.println("The Usage is under 100 units:"+curr_read*2.50);
}
else if(cus2.equals(cus_name) && id2==id)
{
	curr_read=222;
	System.out.println("The usage is under 500 units:"+curr_read*4);
}	
}
}
}
}