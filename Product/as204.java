import java.util.Scanner;
class main
{
	public static void main(String[] args)
{
	int arr1[]={2,1,9,9,9,4,3,2,1,0};
	int arr2[]={3,9,8,7,8,9,4,9,2,1};
	int arr3[]={9,8,5,6,7,8,9,8,9,2};
	int arr4[]={8,7,6,7,8,9,6,7,8,9};
	int arr5[]={9,8,9,9,9,6,5,6,7,8};
	int res[]=new int[4];
	int j=0;
	for(int i=0;i<9;i++)
{
	if((arr1[i]<arr2[i] && arr1[i]<arr1[i+1] && arr1[i]<arr1[i-1]))
{	
	//System.out.println("JI");
	res[j]=arr1[i];
	j++;
}
}
for(int k=0;k<2;k++)
{
res[k]+=1;
}
	//res[2]=min++;
	int t=2;
	for(int i=0;i<9;i++)
{
	if((arr3[i]<arr4[i] && arr3[i]<arr2[i] && arr3[i]<arr3[i+1] && arr3[i]<arr3[i-1]))
{	
	//System.out.println("HqwrqwrfI");
	res[t]=arr3[i];
	t++;
}
}
/*for(int k=t;k<t+1;k++)
{
res[k]+=1;
}*/
res[2]=res[2]+1;
	int y=3;
	for(int i=0;i<9;i++)
{
	if((arr5[i]<arr4[i] && arr5[i]<arr5[i+1] && arr5[i]<arr5[i-1]))
{	
	//System.out.println("HI");
	res[y]=arr5[i];
	/*System.out.println("Index"+i);
	System.out.println("Value"+arr5[i]);*/
	y++;
}
}
for(int k=3;k<y;k++)
{
res[k]+=1;
}
//res[3]=res[3]+1;
for(int u=0;u<4;u++)
{
	System.out.println(res[u]);
}
System.out.println("Sum of Lower points is:");
int sum=0;
for(int i=0;i<4;i++)
{
	sum+=res[i];
}
System.out.println(sum);
}
}