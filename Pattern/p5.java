import java.util.Scanner;
 class main{
    public static void main(String[] args)
    {   
        Scanner s=new Scanner(System.in);
		System.out.println("Enter any ODD number:");
        int n=s.nextInt();
        int mid=n/2+1;
        System.out.println("Your Pattern...");
        int inc,inr;
            for(int y=1;y<=n;y++)
        {
            System.out.printf("1 ");
        } 
        inr=mid-1;
        inc=mid;
		System.out.println();
        for(int i=1;i<=(n/2);i++)
        {   
            for(int j=1;j<=n;j++)
            {   
                if((j==inc || j==n-inr) && (i!=mid))
                {
                System.out.printf("0 ");
                }
                else
                {
                    System.out.printf("1 ");
                }
            }
			System.out.println();
			inc--;
			inr--;
        }
        int sta=3;
        int inc1;
        int inr1=2;
        for(int uu=mid+1;uu<n;uu++)
        {
            inc1=sta;
            for(int yy=1;yy<=n;yy++)
            {
                if((yy==inc1 || yy==n-inr1) && (uu!=mid))
                {
                    System.out.printf("0 ");
                }
                else
                {
                    System.out.printf("1 ");
                }
            }
            System.out.println();
            sta++;
            inr1++;
        }
              for(int y=1;y<=n;y++)
        {
            System.out.printf("1 ");
        } 
        
    }
}