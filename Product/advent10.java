import java.util.*;
class main
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the No of Inputs:");
        int n=s.nextInt();
        String s1="noop";
        String s2="addx";
        int x=0;
        int cyno=0;
        int g=0;
        String[] s3=new String[n];
        int[] ad=new int[10];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Input:");
            s3[i]=s.next();
            if(s3[i].equals(s2))
            {   
                System.out.println("Enter No:");
                ad[g]=s.nextInt();
            }
            g++;
        }
        int h=0;
        for(int i=0;i<n;i++)
        {
        int flag=0;
        if(s3[i].equals(s1))
        {
            cyno++;
            x+=cyno;
        }
        else if(s3[i].equals(s2))
        {
            flag=1;
        }
        if(flag==1)
        {
            x+=ad[h];
        }
        h++;
        }
        System.out.println("The X Value:"+x);
    }
}