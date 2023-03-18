//package COE_NIGHT;
import java.util.*;
class String_cmp{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter String : ");
		String s = sc.next();

		System.out.println("Enter String 2 :");
		String s2 = sc.next();
		int count=0;
		
		char []ch = s.toCharArray();
		char []ch2 = s2.toCharArray();
		
		char []cmp=new char[2];
		int []ind = new int[2];
		
		for(int i=0;i<ch.length;i++)
		{
			if(count==2)
			{
				break;
			}
			if(ch[i]!=ch2[i])
			{
				ind[count]=i;
				cmp[count]=ch[i];
				count++;
			}
		}
		ch2[ind[0]]=cmp[0];
		ch2[ind[1]]=cmp[1];
		
		s2=new String(ch2);
		//if(ch2.equals(ch))
		if(s2.contains(s))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}
