import java.util.*;
class main
{
    public static void main(String args[])
    {   
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int[] sum=new int[5];
        int res=0;
        int j=0;
        for(int i=0;i<3;i++)
        {
            res+=arr[i];
        }
        sum[j]=res;
        res=0;
        j++;
        for(int i=3;i<4;i++)
        {
            res+=arr[i];
        }
        sum[j]=res;
        res=0;
        j++;
        for(int i=4;i<6;i++)
        {
            res+=arr[i];
        }
        sum[j]=res;
        res=0;
        j++;
        for(int i=6;i<9;i++)
        {
            res+=arr[i];
        }
        sum[j]=res;
        res=0;
        j++;
        for(int i=9;i<10;i++)
        {
            res+=arr[i];
        }
        sum[j]=res;
        Arrays.sort(sum);
       /* for(int i=0;i<5;i++)
        {
            System.out.println("Elements:"+sum[i]);
        }*/
        System.out.println(sum[4]);
    }
}