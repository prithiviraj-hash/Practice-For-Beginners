package COE_NIGHT;
import java.util.*;
public class TRIPLET_SUM_OF_TWO_IS_THIRD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int arr[] =new int[n];
		int i,j,k;
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				int val=arr[i]+arr[j];
				for(k=0;k<n;k++)
				{
					if(val==arr[k])
					{
						count++;
						break;
					}
				}
			}
		}
		System.out.println(count);
			

	}