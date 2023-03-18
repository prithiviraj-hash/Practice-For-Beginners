import java.util.*;
class main
{
    public static void main(String[] args)
    {
        //employee e=new employee();
        manager m=new manager();
    }
}
class employee
{
    String arr[]={"Prithivi","Sudharsan","Sriram","Harish","Laya"};
    int id[]={100,102,104,106,108};
    int len=arr.length;
    employee()
    {
	//System.out.println("HI");
        for(int i=0;i<this.len;i++)
        {
        System.out.printf("%s ",arr[i]);
        }
    }
}
class manager extends employee
{
    Scanner s=new Scanner(System.in);
    manager()
    {
	System.out.println();
    System.out.println("Enter No of Managers to Assign:");
    int n=s.nextInt();
    String r="";
    String manager[]=new String[n];
    for(int i=0;i<n;i++)
    {
    System.out.println("Enter Manager Name:");
    r=s.next();
    manager[i]=r;
    }
    int count=0;
    int ids[]=new int[n];
    int k=0;
    for(int i=0;i<manager.length;i++)
    {
        for(int j=0;j<arr.length;j++)
        {
            //System.out.println("HI");
            if(manager[i].equals(arr[j]))
            {
                //System.out.println("I:"+i);
                //System.out.println("J:"+j);
                count++;
                ids[k]=this.id[j];
			this.id[j]=0;
			k++;
            }
        }
    }
    for(int i=0;i<n;i++)
    {
        System.out.println("Managers:"+manager[i]);
        //System.out.println("Their Allocated ID:"+ids[k]);
    }
    //System.out.println("K:"+k);
	for(int i=0;i<k;i++)
{
	System.out.println("Their Allocated ID:"+ids[i]);
}
	for(int i=0;i<this.id.length;i++)
    {
        System.out.println("ID:"+id[i]);
    }
    }
}
/*class team_members extends employee
{
    
}*/
/*class finder
{
    System.out.println("Enter Your Id:");
    int res=s.nextInt();
    System.out.println("NAME:"+)
}*/
/*System.out.println("Enter Your Id:");
    int res=s.nextInt();
    //for(int j=0;j<n;j++)
    //{
    for(int i=0;i<this.id.length;i++)
    {
        //System.out.println("HI");
        if(this.id[i]!=0)
        {
                if(res==this.id[i])
                {
                    System.out.printf("\n%s is a Non Manager Employee:",arr[i]);
                }
                else{
                    System.out.println("\n%s is a Manager Employee:",arr[i]);
                }
        }
    }*/
