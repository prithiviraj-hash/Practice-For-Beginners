import java.util.Scanner;
class main
{
public static void main(String[] args)
{	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter The First two numbers:");
	int real1=s.nextInt();
	int img1=s.nextInt();	
	System.out.println("Enter The Second two number:");
	int real2=s.nextInt();
	int img2=s.nextInt();
	result re=new result();
	re.res1(real1,img1,real2,img2);
	re.res2(real1,img1,real2,img2);
	re.res3(real1,img1,real2,img2);
}
}
class result
{
	void res1(int re1,int im1,int re2,int im2)
{
	System.out.printf("\nAddtion %d+%di",re1+re2,im1+im2);
}
	void res2(int re1,int im1,int re2,int im2)
{
	System.out.printf("\nSubtraction %d+%di",re1-re2,im1-im2);
}
	void res3(int re1,int im1,int re2,int im2)
{
	//(re1+im1)*(re2+img2)
	System.out.printf("\nMultiply %d+%di",(re1*re2)-(im1*im2),(re1*im2+re2*im1));
	//System.out.printf("re2 %d im2 %d",re2,im2);
}
}