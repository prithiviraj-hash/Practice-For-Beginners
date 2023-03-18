import java.util.*;
class main
{
    public static void main(String [] args)
    {
        int arr[]={7, 0, 4, 2, 5, 0, 6, 4, 0, 5};
        int arr1[]={7, 0, 4, 2, 5, 0, 6, 4, 0, 5};
        int len=arr.length;
        int lens=len;
        //System.out.println(len);
        int count=0;
        int max1=0;
        int max2=0;
        max1=arr[0];
        int st=0;
        for(int i=0;i<len;i++)
        {
            if(max1<arr[i])
            {
                max1=arr[i];
                st=i;
            }
        }
        
        for(int i=0;i<len;i++)
        {
            if(i==st)
            {
                for(int j=i;j<lens-1;j++)
                {
                arr1[j]=arr1[j+1];
                //lens--;
                }
            }   
        }
        int end=0;
        max2=arr1[0];
        for(int i=0;i<lens-1;i++)
        {
            if(max2<arr1[i])
            {
                max2=arr1[i];
                end=i;
            }
            //System.out.println(arr1[i]);
        }
        int dum=0;
        int sr=0;
        //System.out.println(max2);
        for(int i=st+1;i<end+1;i++)
        {
            //dum=arr[i];
            //System.out.println("ARr:"+arr[i]);
            if(arr[i]<arr[end+1])
            {
                dum=arr[i];
                sr=0;
                while(dum!=arr[end+1])
                {
                    dum++;
                    sr++;
                    //System.out.println("Dum:"+dum);
                }//System.out.println("Dum:"+dum);
                //
            }
            count+=sr;
        }
        System.out.println(count);
        int sf=0;
        int sy=0;
        for(int i=end+2;i<len-1;i++)
        {
            if(arr[i]<arr[len-1])
            {
                sf=arr[i];
                sy=0;
                while(sf!=arr[len-1])
                {
                    sf++;
                    sy++;
			//System.out.println("SY:"+sy);
                }
			//System.out.println("HI");
            }
            count+=sy;
        }
        System.out.println("Output:"+count);
    }
}