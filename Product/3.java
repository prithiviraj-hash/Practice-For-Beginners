import java.util.*;
class main
{
public static void main(String[] args)
{
	ArrayList<Integer> demo1=new ArrayList<>();
	ArrayList<Integer> demo2=new ArrayList<>();
	demo1.add(1);
	demo1.add(2);
	demo1.add(3);
	demo2.add(1);
	demo2.add(2);
	demo2.add(3);
	System.out.println("ArrayList1:"+demo1);
	demo2.addAll(demo1);
	System.out.println("ArrayList2:"+demo2);
}
}