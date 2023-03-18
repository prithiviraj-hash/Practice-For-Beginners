import java.util.*;
class main
{
    public static void main(String[] args)
    {
        String s1="xyyzz";
        int countx=0;
        int county=0;
        int countz=0;
        int len=s1.length();
        for(int i=0;i<len;i++)
        {
            if(s1.charAt(i)=='x')
            {
                countx++;
            }
            else if(s1.charAt(i)=='y')
            {
                county++;
            }
            else if(s1.charAt(i)=='z')
            {
                countz++;
            }
        }
        System.out.println("Countx:"+countx);
        int temp1=countx;
        System.out.println("County:"+county);
        System.out.println("Countz:"+countz);
if(countx==0)
{
if((countz==county))
        {
            System.out.println("Yes");
        }
if((countx==(county)-1)&& (county-1)==countz)
{
		System.out.println("Yes");
}
if((county)==(countz)-1))
{
		System.out.println("Yes");
}
if()
}
if((countx==county) && (countx==countz))
        {
            System.out.println("Yes");
        }
if(((countx)-1==county)&& (countx-1)==countz)
{
		System.out.println("Yes");
}
if((countx==(county)-1)&& (county-1)==countz)
{
		System.out.println("Yes");
}
if((countx==(countz)-1&&(county)==(countz)-1))
{
		System.out.println("Yes");
}
        else
        {
            System.out.println("No");
        }
    }
}