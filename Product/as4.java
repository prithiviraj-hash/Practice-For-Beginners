import java.util.*;
class main
{
	public static void main(String[] args)
{
	int arr[]={16,1,2,0,4,2,7,1,2,14};
	int len=arr.length;
	int cost[]=new int[len];
	int h=0;
	int pos=0;
	int fuel=0;
	int times=0;
	int sum=0;
//for(int y=0;y<len;y++)
{
	for(int i=0;i<len;i++)
{
	
	for(int j=0;j<len;j++)
{
	times=0;
	//System.out.println("I:"+i);
	pos=j;
	fuel=arr[j];
	System.out.println("J:"+arr[j]);
	System.out.println("ToI:"+arr[i]);
	//System.out.println(fuel);
	if(pos==i)
{
	fuel=0;
	System.out.println("Fuel:"+fuel);
}
else
{
	while(pos!=i)
{
	
	if(pos<i)
{
	pos++;
	//times++;
	if(fuel>arr[i])
{
	fuel--;
	times++;
	System.out.println("Fuel:"+fuel);
	System.out.println("Times:"+times);
}
	else if(fuel<arr[i])
{
	fuel++;
	times++;
	System.out.println("Fuel:"+fuel);
	System.out.println("Times:"+times);
}
}
	else if(pos>i)
{
	pos--;
	if(fuel>arr[i])
{
	fuel--;	
	times++;
	System.out.println("Fuel:"+fuel);
	System.out.println("Times:"+times);
}
	else if(fuel<arr[i])
{
	fuel++;
	times++;
	System.out.println("Fuel:"+fuel);
	System.out.println("Times:"+times);
}
}
}
}	
	//h++;
}
	sum+=times;
	cost[i]=sum;
}
}
	for(int i=0;i<cost.length;i++)
{
	System.out.println("Cost:"+cost[i]);
}
}
}