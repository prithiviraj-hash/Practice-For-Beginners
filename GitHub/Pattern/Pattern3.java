import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter String:");
    String str=s.nextLine();
    int size=str.length();
    int count=1;
    int size1=size;
    int size2=size;
    int size3=size;
    int size4=size;
    if(size%2!=0)
    {
        size3=size3-1;
    }
    size1+=size3;
    size3=size1;
    if(count<=size)
    {
    for(int i=0;i<size;i++)
    {   
	    size1-=1;
        while(size1>=1)
        {   
            System.out.printf(" ");
            size1--;
        }
        for(int j=1;j<=count;j++)
        {
            System.out.printf("* ");  
        }
        count++;
        System.out.println();
        size3--;
        size1=size3;
    }
    }
    size3=size;
    String[] arr = str.split("");
    if(size%2!=0)
    {
        size3=size3-1;
        int yy=2;
        while(yy>=1)
        {
        for(int i=1;i<=size3;i++)
        {
        System.out.print("*");
        }
        if(yy!=1)
        {
        for(int u=0;u<size;u++)
        {
        System.out.printf("%s ",arr[u]);
        }
        }
        yy--;
        }
    }
    else if(size%2==0)
    {
        int uu=2;
        while(uu>=1)
        {
            for(int i=1;i<=size4;i++)
            {
                System.out.print("*");
            }
            if(uu!=1)
            {
                for(int u=0;u<size;u++)
                {
                System.out.printf("%s ",arr[u]);
            }
            }
            uu--;
            }
    }
	System.out.println();
	for(int i=1;i<=size3;i++)
        {
        System.out.print(" ");
        }
    	for(int hi=1;hi<=size;hi++)
    {
        System.out.printf("* ");
    }
    }
}