package COE_NIGHT;
import java.util.*;
public class VOWEL_REVERSE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string :");
		String string = sc.next();
		int index[]= new int[string.length()];
		char ch[]= new char[string.length()];
		char str[] = string.toCharArray();
		int in=0,i,j;
		char vowel[] = {'a','e','i','o','u','A','E','I','O','U'};
		for(i=0;i<string.length();i++)//str[i]!='\0'
		{
			//char a=string.charAt(i);
			for(j=0;j<vowel.length;j++)
			{
				if(string.charAt(i)==vowel[j])
				{
					ch[in]=string.charAt(i);
					index[in]=i;
					in++;
				}
			}
		}
		//System.out.println(" "+in);
		for(i=0,j=in-1;i<in;i++,j--)
		{
			str[index[i]]=ch[j];
		}
		String out = new String(str);
		System.out.println(str);
		/*for(i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]+" "+index[i]);
		}*/
	}

}
