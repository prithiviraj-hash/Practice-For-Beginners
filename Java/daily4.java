import java.util.Scanner;
class main
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Salary and no of working hrs per day:");
	int a=s.nextInt();
	int b=s.nextInt();
	employee e=new employee();
	int res=0;
	res=e.getInfo(a,b);
	if(res<500)
{
	res=e.AddSal(a);
}	
	if(b>6)
{
	res=e.AddWork(b,res);
}
System.out.println("Output:"+res);
}
}
class employee
{
	int getInfo(int sal,int hrs)
{
	return sal;
}
	int AddSal(int sal1)
{
	return sal1+10;
}
	int AddWork(int as,int sall)
{
	return sall+5;
}
}