class Student5
{	
int id;
String name;
Student5(int i,String n)
{
	id=i;
	name=n;
}
/*Student5(Student5 s)
{
	id=s.id;
	name=s.name;
}*/
Student5()
{}
void display()
{
	System.out.println(id+" "+name);
}
	public static void main(String args[])
{
	Student5 s1=new Student5(111,"karan");
	//Student5 s2=new Student5(s1);	
	//Student5 s2=new Student5(111,"karan",25);
	Student5 s2=new Student5(); //0,"hello"
	s1.display();
	s2.id=s1.id;
	s2.name=s1.name;
	s2.display();	
}
}