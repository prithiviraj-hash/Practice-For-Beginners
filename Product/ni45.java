import java.util.*;
class main
{
    public static void main(String[] args)
    {
        int arr[]={1,9,6,4,5};
        int len=arr.length;
        int count=0;
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(arr[i]>arr[j])
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}