import java.util.Scanner;
class main
{
public static void main(String[] args)
{   
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the Size of the array:");
    int n=s.nextInt();
	int i;
    int arr[]=new int[n];
    for(int j=0;j<n;j++)
    {
        arr[j]=s.nextInt();
    }
    int count=0;
    int res=arr[0];
    int j=0;
    int qw=0;
    System.out.println("N:"+n);
    while(res!=arr[n-1])
    {
/*System.out.println("HI:"+res);
	System.out.println("HI:"+res);*/
    int fg=arr[j];
    /*if(fg==0)
    {
        System.out.println("-1");
    }*/
    //else
    
    for(i=qw;i<=fg;i++)
    {
	  j=arr[i];
	  qw=i;
        res=arr[i];
        System.out.println("I:"+i);
	  System.out.println("arr:"+arr[i]);
    }
//System.out.println("Res:"+res);
//System.out.println();
    
    //j++;
    count++;
    }
    System.out.println("Output:"+(count-1));
}
}