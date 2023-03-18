import java.util.Scanner;
class main
{	
	int setvalue(int i,String na)
{
	int id=i;
	String name=na;
	return id;
}
	void display()
{
	System.out.println("Id:");
}

	public static void main(String args[])
{
	main m=new main();
	//System.out.println("ID:"+m.setvalue(4,"Prithivi"));
	m.display(m.setvalue(4,"Prithivi"));
	//System.out.println("NAME:"+m.name);
	//System.out.println("NAME:"+m.id);
}
}