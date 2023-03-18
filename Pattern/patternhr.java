import java.util.*;
class main
{
    public static void main(String[] args)
    {   
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=s.nextInt();
        int cpy=0;
        int res=0;
        int len=(n*2)-1;
        int det=n-2;
        int[] arr=new int[len];
        res=n-2;
        System.out.println();
        for(int i=0;i<len;i++)
        {
            arr[i]=0;
        }
        for(int i=0;i<len;i++)
        {
            System.out.printf("%d ",arr[i]);
        }
		System.out.println();
		    int dec=0;
		    int mid=(len/2);
		    int kk=res;
		    int k=res;
            int sss=len-res;
        for(int i=0;i<len-2;i++)
        {   
            cpy++;
            dec++;
            if(dec<=mid)
            {
            for(int u=i+1;u<len-dec;u++)
            {
                arr[u]=cpy;
            }
            }
            if(dec>mid)
            {   
            while(k<sss)
            {
		    arr[k]=det;
		    k++;
            }
            k=kk;
            k--;
            kk--;
            sss++;
            res++;
            det--;
            }
            for(int j=0;j<len;j++)
            {
                System.out.printf("%d ",arr[j]);
            }
            System.out.println();
        }
        for(int i=0;i<len;i++)
        {
            arr[i]=0;
        }
        for(int i=0;i<len;i++)
        {
            System.out.printf("%d ",arr[i]);
        }
    }
}