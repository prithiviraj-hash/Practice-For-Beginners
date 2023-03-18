import java.util.Scanner;
class main{
    public static void main(String[] args)
    {   
        Scanner s=new Scanner(System.in);
		System.out.println("Enter any ODD number:");
        int n=s.nextInt();
        int mid=n/2+1;
        int a;
        System.out.println("Your Pattern using array..");
        int arr[]=new int[n];
        for(a=0;a<n;a++)
        {
            arr[a]=1;
        }
        for(a=0;a<n;a++)
        {
             System.out.printf("%d ",arr[a]);
        }
        int inc,inr;
        inr=mid-2;
        inc=mid;
		System.out.println();
        for(int i=1;i<=(n/2)-1;i++)
        {   
                           
                for(int ab=inc-1;ab<n-inr-1;ab++)
                {
                    arr[ab]=0;
                }
                for(int c=0;c<n;c++)
                {
                    System.out.printf("%d ",arr[c]);
                }
            
			System.out.println();
			inc--;
			inr--;
        }
        for(a=0;a<n;a++)
        {
            arr[a]=0;
        }
        for(int uuu=0;uuu<n;uuu++)
        {
            if(uuu==mid-1 || uuu==0 || uuu==n-1)
            {
                    arr[uuu]=1;
            }
        }
        for(a=0;a<n;a++)
            {
                System.out.printf("%d ",arr[a]);
            }
        System.out.println();
        for(a=0;a<n;a++)
        {
            arr[a]=1;
        }
        int sta=2;
        int inc1;
        int inr1=2;
        for(int uu=mid+1;uu<n;uu++)
        {
            inc1=sta;
            for(int abc=inc1;abc<n-inr1;abc++)
            {
                arr[abc]=0;
            }
            for(a=0;a<n;a++)
            {
                System.out.printf("%d ",arr[a]);
            }
            for(a=0;a<n;a++)
        {
            arr[a]=1;
        }
            System.out.println();
            sta++;
            inr1++;
        }
         for(a=0;a<n;a++)
        {
            arr[a]=1;
        }
        for(a=0;a<n;a++)
        {
             System.out.printf("%d ",arr[a]);
        } 
        
    }
}