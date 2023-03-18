import java.util.*;
class main
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String 1:");
        String s1=s.next();//"geeks";
        System.out.println("Enter String 2:");
        String s2=s.next();//"keegs";
        int len=s1.length();
        char S1[]=new char[len];
        char S2[]=new char[len];
        for(int i=0;i<len;i++)
        {
            S1[i]=s1.charAt(i);
        }
        for(int i=0;i<len;i++)
        {
            
            S2[i]=s2.charAt(i);
        }
        int a1[]=new int[2];
        int y=0;
        for(int i=0;i<len;i++)
        {
            if(y==0 || y>0)
            {
                if(y>0)
                {
                    y=1;
                }
            if(S1[i]!=S2[i])
            {
                a1[y]=i;
                y++;
            }
            }
        }
       char temp='a';
       for(int i=0;i<len;i++)
       {
           if (i==a1[0])
           {
               temp=S2[a1[0]];
               S2[i]=S2[a1[1]];
           }
           else if(i==a1[1])
           {
              
               S2[i]=temp;
           }
       }
       s2=String.valueOf(S2);
       System.out.println(s2);
       if(s1.equals(s2))
       {
           System.out.println("Yes");
       }
       else
       {
           System.out.println("No");
       }
    }
}